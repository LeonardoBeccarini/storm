package myTests;

import org.apache.storm.generated.StormTopology;
import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.*;
import org.apache.storm.windowing.TimestampExtractor;
import org.apache.storm.windowing.TupleWindow;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TopologyBuilderTest {

    public enum ComponentType {
        BOLT,
        SPOUT
    }

    /**
     * Dummy IWindowedBolt compatibile con versioni in cui IWindowedBolt richiede getTimestampExtractor().
     */
    private static class DummyWindowedBolt implements IWindowedBolt, Serializable {

        @Override
        public void prepare(Map<String, Object> stormConf, TopologyContext context, OutputCollector collector) {
            // no-op
        }

        @Override
        public void execute(TupleWindow inputWindow) {
            // no-op
        }

        @Override
        public void cleanup() {
            // no-op
        }

        @Override
        public void declareOutputFields(OutputFieldsDeclarer declarer) {
            // no-op
        }

        @Override
        public Map<String, Object> getComponentConfiguration() {
            return null;
        }

        @Override
        public TimestampExtractor getTimestampExtractor() {
            // neutro: non dipende dalla tuple
            return tuple -> 0L;
        }
    }

    private static class DummySpout implements IRichSpout, Serializable {

        @Override
        public void open(Map<String, Object> conf, TopologyContext context, SpoutOutputCollector collector) {
            // no-op
        }

        @Override
        public void close() {
            // no-op
        }

        @Override
        public void activate() {
            // no-op
        }

        @Override
        public void deactivate() {
            // no-op
        }

        @Override
        public void nextTuple() {
            // no-op
        }

        @Override
        public void ack(Object msgId) {
            // no-op
        }

        @Override
        public void fail(Object msgId) {
            // no-op
        }

        @Override
        public void declareOutputFields(OutputFieldsDeclarer declarer) {
            // no-op
        }

        @Override
        public Map<String, Object> getComponentConfiguration() {
            return null;
        }
    }

    @Parameterized.Parameters(name = "TC{0}-{1}: id={2}, componentIsNull={3}, parallelism={4}, expected={5}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // tc, componentType, id, componentIsNull, parallelismHint, expectedException (null = no exception)

                // --- setBolt ---
                {1,  ComponentType.BOLT,  "pippo",                 false, 1,    null},
                {2,  ComponentType.BOLT,  "pippo",                 true,  1,    NullPointerException.class}, // tc2: NPE noto
                {3,  ComponentType.BOLT,  "pippo",                 false, 0,    IllegalArgumentException.class},
                {4,  ComponentType.BOLT,  "pippo",                 false, null, null},
             //   {5,  ComponentType.BOLT,  null,                    false, 1,    IllegalArgumentException.class},
            //    {6,  ComponentType.BOLT,  "",                      false, 1,    IllegalArgumentException.class},
                {7,  ComponentType.BOLT,  "duplicated_bolt",       false, 1,    IllegalArgumentException.class},
                {8,  ComponentType.BOLT,  "duplicated_bolt_spout", false, 1,    IllegalArgumentException.class},

                // --- setSpout ---
                {9, ComponentType.SPOUT, "spout_ok",              false, 1,    null},
                // Tipo eccezione su spout null puo' variare tra versioni: uso RuntimeException per coprire NPE/IAE
                {10, ComponentType.SPOUT, "spout_ok",              true,  1,    RuntimeException.class},
                {11, ComponentType.SPOUT, "spout_ok",              false, 0,    IllegalArgumentException.class},
                {12, ComponentType.SPOUT, "spout_ok",              false, null, null},
            //    {13, ComponentType.SPOUT, null,                    false, 1,    IllegalArgumentException.class},
             //   {14, ComponentType.SPOUT, "",                      false, 1,    IllegalArgumentException.class},
                {15, ComponentType.SPOUT, "duplicated_spout",      false, 1,    IllegalArgumentException.class},
                {16, ComponentType.SPOUT, "duplicated_spout_bolt", false, 1,    IllegalArgumentException.class}
        });
    }

    private final int tc;
    private final ComponentType componentType;
    private final String id;
    private final boolean componentIsNull;
    private final Number parallelismHint;
    private final Class<? extends Throwable> expectedException;

    private TopologyBuilder builder;
    private IWindowedBolt validBolt;
    private IRichSpout spout;

    public TopologyBuilderTest(int tc,
                               ComponentType componentType,
                               String id,
                               boolean componentIsNull,
                               Number parallelismHint,
                               Class<? extends Throwable> expectedException) {
        this.tc = tc;
        this.componentType = componentType;
        this.id = id;
        this.componentIsNull = componentIsNull;
        this.parallelismHint = parallelismHint;
        this.expectedException = expectedException;
    }

    @Before
    public void setUp() {
        builder = new TopologyBuilder();
        validBolt = new DummyWindowedBolt();
        spout = new DummySpout();

        // Precondizioni per duplicati (stesso id gia' presente)
        if (tc == 7) {
            BoltDeclarer first = builder.setBolt(id, validBolt, 1);
            assertNotNull("Precondizione duplicated_bolt fallita (prima setBolt)", first);
        } else if (tc == 8) {
            SpoutDeclarer s = builder.setSpout(id, spout, 1);
            assertNotNull("Precondizione duplicated_bolt_spout fallita (prima setSpout)", s);
        } else if (tc == 15) {
            SpoutDeclarer first = builder.setSpout(id, spout, 1);
            assertNotNull("Precondizione duplicated_spout fallita (prima setSpout)", first);
        } else if (tc == 16) {
            BoltDeclarer b = builder.setBolt(id, validBolt, 1);
            assertNotNull("Precondizione duplicated_spout_bolt fallita (prima setBolt)", b);
        }
    }

    @After
    public void tearDown() {
        // Non strettamente necessario (JUnit richiama @Before per ogni @Test),
        // ma aiuta a evitare qualunque conflitto/side-effect tra esecuzioni.
        builder = null;
        validBolt = null;
        spout = null;
    }

    @Test
    public void testSetBoltAndSetSpout_withFinalTopologyVerification() {
        switch (componentType) {
            case BOLT:
                runSetBoltCase();
                break;
            case SPOUT:
                runSetSpoutCase();
                break;
            default:
                fail("Tipo componente non gestito: " + componentType);
        }
    }

    private void runSetBoltCase() {
        final IWindowedBolt bolt = componentIsNull ? null : validBolt;

        if (expectedException != null) {
            assertThrows("Attesa eccezione su setBolt (TC " + tc + ")",
                    (Class) expectedException,
                    () -> builder.setBolt(id, bolt, parallelismHint));
            return;
        }

        BoltDeclarer result = builder.setBolt(id, bolt, parallelismHint);
        assertNotNull("BoltDeclarer non dovrebbe essere null (TC " + tc + ")", result);

        // Verifica topologia finale
        StormTopology topology = builder.createTopology();
        assertNotNull("createTopology non dovrebbe restituire null (TC " + tc + ")", topology);
        assertNotNull("Mappa bolts nulla (TC " + tc + ")", topology.get_bolts());
        assertTrue("Il bolt dovrebbe essere presente nella topologia (TC " + tc + ")",
                topology.get_bolts().containsKey(id));
    }

    private void runSetSpoutCase() {
        final IRichSpout s = componentIsNull ? null : spout;

        if (expectedException != null) {
            assertThrows("Attesa eccezione su setSpout (TC " + tc + ")",
                    (Class) expectedException,
                    () -> builder.setSpout(id, s, parallelismHint));
            return;
        }

        SpoutDeclarer result = builder.setSpout(id, s, parallelismHint);
        assertNotNull("SpoutDeclarer non dovrebbe essere null (TC " + tc + ")", result);

        // Verifica topologia finale
        StormTopology topology = builder.createTopology();
        assertNotNull("createTopology non dovrebbe restituire null (TC " + tc + ")", topology);
        assertNotNull("Mappa spouts nulla (TC " + tc + ")", topology.get_spouts());
        assertTrue("Lo spout dovrebbe essere presente nella topologia (TC " + tc + ")",
                topology.get_spouts().containsKey(id));
    }
}
