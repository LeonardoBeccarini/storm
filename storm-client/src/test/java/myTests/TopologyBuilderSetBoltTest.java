package myTests;

import org.apache.storm.topology.BoltDeclarer;
import org.apache.storm.topology.IWindowedBolt;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.windowing.TimestampExtractor;
import org.apache.storm.windowing.TupleWindow;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TopologyBuilderSetBoltTest {

    // Implementazione minimale compatibile con versioni di Storm in cui IWindowedBolt
    // richiede anche getTimestampExtractor().
    private static class DummyWindowedBolt implements IWindowedBolt {

        @Override
        public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
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
            // TimestampExtractor è un functional interface in Storm:
            // ritorniamo un estrattore "neutro" che non dipende dal contenuto della Tuple.
            return tuple -> 0L;
        }
    }

    @Parameterized.Parameters(name = "TC{0}: id={1}, boltIsNull={2}, parallelism={3}, excExpected={4}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "pippo",      false, 1,  false},
                {2, "pippo",      true, 1,  true},
                {3, "pippo",      false, -1, true},
                {4, "pippo",      false, 0,  true},
                {5, "pippo",      false, null, false}, // usa valore di parallelismo di default?
                {6, null,         false, 1,  false},    // usa id di default?
                {7, " ",          false, 1,  false},    // usa id di default?
                {8, "duplicated", false, 1,  true},
        });
    }

    private final int tc;
    private final String id;
    private final boolean boltIsNull;
    private final Number parallelismHint;
    private final boolean isExceptionExpected;

    private TopologyBuilder builder;
    private IWindowedBolt validBolt;

    public TopologyBuilderSetBoltTest(
            int tc, String id, boolean boltIsNull, Number parallelismHint, boolean isExceptionExpected
    ) {
        this.tc = tc;
        this.id = id;
        this.boltIsNull = boltIsNull;
        this.parallelismHint = parallelismHint;
        this.isExceptionExpected = isExceptionExpected;
    }

    @Before
    public void setUp() {
        builder = new TopologyBuilder();
        validBolt = new DummyWindowedBolt();

        // Precondizione per il caso duplicated: registro prima lo stesso id
        if (tc == 8) {
            BoltDeclarer first = builder.setBolt(id, validBolt, 1);
            assertNotNull("Precondizione duplicated fallita (prima setBolt)", first);
        }
    }

    @Test
    public void testSetBolt() {
        IWindowedBolt bolt = boltIsNull ? null : validBolt;

        try {
            BoltDeclarer result = builder.setBolt(id, bolt, parallelismHint);
            if (isExceptionExpected) {
                fail("Attesa eccezione, non lanciata (TC " + tc + ")");
            }
            assertNotNull("BoltDeclarer non dovrebbe essere null (TC " + tc + ")", result);
        } catch (Exception e) {
            if (!isExceptionExpected) {
                fail("Non attesa eccezione, lanciata (TC " + tc + "): " + e.getMessage());
            }
        }
    }
}
