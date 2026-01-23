/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package myTests;

import org.apache.storm.generated.StormTopology;
import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.*;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.topology.base.BaseWindowedBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.windowing.TupleWindow;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Unit tests for {@link TopologyBuilder} class focusing on:
 * - {@link TopologyBuilder#setBolt(String, IWindowedBolt, Number)}
 * - {@link TopologyBuilder#setSpout(String, IRichSpout, Number)}
 */
@RunWith(MockitoJUnitRunner.class)
public class TopologyBuilderZeroShotTest {

    private TopologyBuilder builder;

    @Mock
    private IWindowedBolt mockWindowedBolt;

    @Mock
    private IRichSpout mockRichSpout;

    @Before
    public void setUp() {
        builder = new TopologyBuilder();
    }

    // ==================== Tests for setBolt(String id, IWindowedBolt bolt, Number parallelismHint) ====================

    /**
     * Test that setBolt with IWindowedBolt and positive parallelism hint succeeds.
     */
    @Test
    public void testSetWindowedBoltWithPositiveParallelismHint() {
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, 5);

        assertNotNull("BoltDeclarer should not be null", declarer);
    }

    /**
     * Test that setBolt with IWindowedBolt and parallelism hint of 1 succeeds.
     */
    @Test
    public void testSetWindowedBoltWithParallelismHintOne() {
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, 1);

        assertNotNull("BoltDeclarer should not be null", declarer);
    }

    /**
     * Test that setBolt with IWindowedBolt and zero parallelism hint throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetWindowedBoltWithZeroParallelismHint() {
        builder.setBolt("windowedBolt", mockWindowedBolt, 0);
    }

    /**
     * Test that setBolt with IWindowedBolt and negative parallelism hint throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetWindowedBoltWithNegativeParallelismHint() {
        builder.setBolt("windowedBolt", mockWindowedBolt, -1);
    }

    /**
     * Test that setBolt with IWindowedBolt and large negative parallelism hint throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetWindowedBoltWithLargeNegativeParallelismHint() {
        builder.setBolt("windowedBolt", mockWindowedBolt, -100);
    }

    /**
     * Test that setBolt with IWindowedBolt and null parallelism hint succeeds (defaults to 1).
     */
    @Test
    public void testSetWindowedBoltWithNullParallelismHint() {
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, null);

        assertNotNull("BoltDeclarer should not be null when parallelism hint is null", declarer);
    }

    /**
     * Test that setBolt with IWindowedBolt and large parallelism hint succeeds.
     */
    @Test
    public void testSetWindowedBoltWithLargeParallelismHint() {
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, 1000);

        assertNotNull("BoltDeclarer should not be null for large parallelism hint", declarer);
    }

    /**
     * Test that setBolt with IWindowedBolt and decimal parallelism hint succeeds
     * (uses integer portion).
     */
    @Test
    public void testSetWindowedBoltWithDecimalParallelismHint() {
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, 5.7);

        assertNotNull("BoltDeclarer should not be null for decimal parallelism hint", declarer);
    }

    /**
     * Test that setBolt with IWindowedBolt and decimal parallelism hint less than 1
     * but greater than 0 throws IllegalArgumentException (since int value is 0).
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetWindowedBoltWithDecimalParallelismHintLessThanOne() {
        builder.setBolt("windowedBolt", mockWindowedBolt, 0.5);
    }

    /**
     * Test that multiple windowed bolts can be added with unique IDs.
     */
    @Test
    public void testSetMultipleWindowedBoltsWithUniqueIds() {
        IWindowedBolt mockBolt1 = mock(IWindowedBolt.class);
        IWindowedBolt mockBolt2 = mock(IWindowedBolt.class);

        BoltDeclarer declarer1 = builder.setBolt("bolt1", mockBolt1, 2);
        BoltDeclarer declarer2 = builder.setBolt("bolt2", mockBolt2, 3);

        assertNotNull("First BoltDeclarer should not be null", declarer1);
        assertNotNull("Second BoltDeclarer should not be null", declarer2);
    }

    /**
     * Test that windowed bolt can be added and topology can be created.
     * Uses concrete implementations to avoid serialization issues.
     */
    @Test
    public void testSetWindowedBoltAndCreateTopology() {
        // Use concrete implementations instead of mocks for topology creation
        TestRichSpout concreteSpout = new TestRichSpout();
        TestWindowedBolt concreteBolt = new TestWindowedBolt();

        builder.setSpout("testSpout", concreteSpout, 1);
        builder.setBolt("windowedBolt", concreteBolt, 2);

        StormTopology topology = builder.createTopology();

        assertNotNull("StormTopology should not be null", topology);
    }

    /**
     * Test that setBolt with concrete BaseWindowedBolt implementation succeeds.
     */
    @Test
    public void testSetWindowedBoltWithConcreteImplementation() {
        BaseWindowedBolt concreteBolt = new TestWindowedBolt();

        BoltDeclarer declarer = builder.setBolt("concreteBolt", concreteBolt, 3);

        assertNotNull("BoltDeclarer should not be null for concrete implementation", declarer);
    }

    /**
     * Test setBolt with IWindowedBolt using Integer as Number type.
     */
    @Test
    public void testSetWindowedBoltWithIntegerParallelismHint() {
        Integer parallelism = 4;
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, parallelism);

        assertNotNull("BoltDeclarer should not be null for Integer parallelism", declarer);
    }

    /**
     * Test setBolt with IWindowedBolt using Long as Number type.
     */
    @Test
    public void testSetWindowedBoltWithLongParallelismHint() {
        Long parallelism = 6L;
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, parallelism);

        assertNotNull("BoltDeclarer should not be null for Long parallelism", declarer);
    }

    // ==================== Tests for setSpout(String id, IRichSpout spout, Number parallelismHint) ====================

    /**
     * Test that setSpout with positive parallelism hint succeeds.
     */
    @Test
    public void testSetSpoutWithPositiveParallelismHint() {
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, 5);

        assertNotNull("SpoutDeclarer should not be null", declarer);
    }

    /**
     * Test that setSpout with parallelism hint of 1 succeeds.
     */
    @Test
    public void testSetSpoutWithParallelismHintOne() {
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, 1);

        assertNotNull("SpoutDeclarer should not be null", declarer);
    }

    /**
     * Test that setSpout with zero parallelism hint throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSpoutWithZeroParallelismHint() {
        builder.setSpout("testSpout", mockRichSpout, 0);
    }

    /**
     * Test that setSpout with negative parallelism hint throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSpoutWithNegativeParallelismHint() {
        builder.setSpout("testSpout", mockRichSpout, -1);
    }

    /**
     * Test that setSpout with large negative parallelism hint throws IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSpoutWithLargeNegativeParallelismHint() {
        builder.setSpout("testSpout", mockRichSpout, -50);
    }

    /**
     * Test that setSpout with null parallelism hint succeeds (defaults to 1).
     */
    @Test
    public void testSetSpoutWithNullParallelismHint() {
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, null);

        assertNotNull("SpoutDeclarer should not be null when parallelism hint is null", declarer);
    }

    /**
     * Test that setSpout with large parallelism hint succeeds.
     */
    @Test
    public void testSetSpoutWithLargeParallelismHint() {
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, 500);

        assertNotNull("SpoutDeclarer should not be null for large parallelism hint", declarer);
    }

    /**
     * Test that setSpout with decimal parallelism hint succeeds
     * (uses integer portion).
     */
    @Test
    public void testSetSpoutWithDecimalParallelismHint() {
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, 3.9);

        assertNotNull("SpoutDeclarer should not be null for decimal parallelism hint", declarer);
    }

    /**
     * Test that setSpout with decimal parallelism hint less than 1 but greater than 0
     * throws IllegalArgumentException (since int value is 0).
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSpoutWithDecimalParallelismHintLessThanOne() {
        builder.setSpout("testSpout", mockRichSpout, 0.9);
    }

    /**
     * Test that multiple spouts can be added with unique IDs.
     */
    @Test
    public void testSetMultipleSpoutsWithUniqueIds() {
        IRichSpout mockSpout1 = mock(IRichSpout.class);
        IRichSpout mockSpout2 = mock(IRichSpout.class);

        SpoutDeclarer declarer1 = builder.setSpout("spout1", mockSpout1, 2);
        SpoutDeclarer declarer2 = builder.setSpout("spout2", mockSpout2, 3);

        assertNotNull("First SpoutDeclarer should not be null", declarer1);
        assertNotNull("Second SpoutDeclarer should not be null", declarer2);
    }

    /**
     * Test that spout can be added and topology can be created.
     * Uses concrete implementation to avoid serialization issues.
     */
    @Test
    public void testSetSpoutAndCreateTopology() {
        TestRichSpout concreteSpout = new TestRichSpout();

        builder.setSpout("testSpout", concreteSpout, 2);

        StormTopology topology = builder.createTopology();

        assertNotNull("StormTopology should not be null", topology);
    }

    /**
     * Test that setSpout with concrete BaseRichSpout implementation succeeds.
     */
    @Test
    public void testSetSpoutWithConcreteImplementation() {
        BaseRichSpout concreteSpout = new TestRichSpout();

        SpoutDeclarer declarer = builder.setSpout("concreteSpout", concreteSpout, 4);

        assertNotNull("SpoutDeclarer should not be null for concrete implementation", declarer);
    }

    /**
     * Test setSpout using Integer as Number type.
     */
    @Test
    public void testSetSpoutWithIntegerParallelismHint() {
        Integer parallelism = 7;
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, parallelism);

        assertNotNull("SpoutDeclarer should not be null for Integer parallelism", declarer);
    }

    /**
     * Test setSpout using Long as Number type.
     */
    @Test
    public void testSetSpoutWithLongParallelismHint() {
        Long parallelism = 8L;
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, parallelism);

        assertNotNull("SpoutDeclarer should not be null for Long parallelism", declarer);
    }

    /**
     * Test setSpout using Short as Number type.
     */
    @Test
    public void testSetSpoutWithShortParallelismHint() {
        Short parallelism = (short) 3;
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, parallelism);

        assertNotNull("SpoutDeclarer should not be null for Short parallelism", declarer);
    }

    // ==================== Combined Tests for setBolt and setSpout ====================

    /**
     * Test building a complete topology with both spout and windowed bolt.
     * Uses concrete implementations to avoid serialization issues.
     */
    @Test
    public void testBuildCompleteTopologyWithSpoutAndWindowedBolt() {
        TestRichSpout concreteSpout = new TestRichSpout();
        TestWindowedBolt concreteBolt = new TestWindowedBolt();

        builder.setSpout("inputSpout", concreteSpout, 2);
        builder.setBolt("processingBolt", concreteBolt, 4);

        StormTopology topology = builder.createTopology();

        assertNotNull("Complete topology should not be null", topology);
    }

    /**
     * Test building topology with multiple spouts and windowed bolts.
     * Uses concrete implementations to avoid serialization issues.
     */
    @Test
    public void testBuildTopologyWithMultipleComponents() {
        TestRichSpout spout1 = new TestRichSpout();
        TestRichSpout spout2 = new TestRichSpout();
        TestWindowedBolt bolt1 = new TestWindowedBolt();
        TestWindowedBolt bolt2 = new TestWindowedBolt();

        builder.setSpout("spout1", spout1, 1);
        builder.setSpout("spout2", spout2, 2);
        builder.setBolt("bolt1", bolt1, 3);
        builder.setBolt("bolt2", bolt2, 4);

        StormTopology topology = builder.createTopology();

        assertNotNull("Topology with multiple components should not be null", topology);
    }

    /**
     * Test that adding spout after bolt works correctly.
     * Uses concrete implementations to avoid serialization issues.
     */
    @Test
    public void testAddSpoutAfterBolt() {
        TestRichSpout concreteSpout = new TestRichSpout();
        TestWindowedBolt concreteBolt = new TestWindowedBolt();

        builder.setBolt("bolt", concreteBolt, 2);
        builder.setSpout("spout", concreteSpout, 1);

        StormTopology topology = builder.createTopology();

        assertNotNull("Topology should be created successfully", topology);
    }

    /**
     * Test BoltDeclarer allows chaining configuration methods.
     * Uses concrete implementations to avoid serialization issues.
     */
    @Test
    public void testBoltDeclarerChaining() {
        TestRichSpout concreteSpout = new TestRichSpout();
        TestWindowedBolt concreteBolt = new TestWindowedBolt();

        builder.setSpout("spout", concreteSpout, 1);

        BoltDeclarer declarer = builder.setBolt("bolt", concreteBolt, 2);

        // BoltDeclarer should support method chaining
        assertNotNull("BoltDeclarer should support chaining", declarer);

        // Test that we can call shuffleGrouping (common chained method)
        BoltDeclarer chainedDeclarer = declarer.shuffleGrouping("spout");
        assertNotNull("Chained BoltDeclarer should not be null", chainedDeclarer);
    }

    /**
     * Test that both spout and bolt return their respective declarer types.
     */
    @Test
    public void testDeclarerTypes() {
        SpoutDeclarer spoutDeclarer = builder.setSpout("spout", mockRichSpout, 1);
        BoltDeclarer boltDeclarer = builder.setBolt("bolt", mockWindowedBolt, 2);

        assertTrue("setSpout should return SpoutDeclarer", spoutDeclarer instanceof SpoutDeclarer);
        assertTrue("setBolt should return BoltDeclarer", boltDeclarer instanceof BoltDeclarer);
    }

    /**
     * Test topology creation with maximum Integer parallelism hint.
     * Uses concrete implementations to avoid serialization issues.
     */
    @Test
    public void testSetComponentsWithMaxIntegerParallelism() {
        TestRichSpout concreteSpout = new TestRichSpout();
        TestWindowedBolt concreteBolt = new TestWindowedBolt();

        builder.setSpout("spout", concreteSpout, Integer.MAX_VALUE);
        builder.setBolt("bolt", concreteBolt, Integer.MAX_VALUE);

        StormTopology topology = builder.createTopology();

        assertNotNull("Topology with max parallelism should be created", topology);
    }

    /**
     * Test that Float parallelism hint works correctly.
     */
    @Test
    public void testSetSpoutWithFloatParallelismHint() {
        Float parallelism = 5.0f;
        SpoutDeclarer declarer = builder.setSpout("testSpout", mockRichSpout, parallelism);

        assertNotNull("SpoutDeclarer should not be null for Float parallelism", declarer);
    }

    /**
     * Test that Float parallelism hint works correctly for setBolt.
     */
    @Test
    public void testSetWindowedBoltWithFloatParallelismHint() {
        Float parallelism = 3.0f;
        BoltDeclarer declarer = builder.setBolt("windowedBolt", mockWindowedBolt, parallelism);

        assertNotNull("BoltDeclarer should not be null for Float parallelism", declarer);
    }

    // ==================== Helper Classes ====================

    /**
     * Test implementation of BaseWindowedBolt for testing purposes.
     */
    private static class TestWindowedBolt extends BaseWindowedBolt {
        private static final long serialVersionUID = 1L;

        @Override
        public void prepare(Map<String, Object> topoConf, TopologyContext context,
                            OutputCollector collector) {
            // No-op for testing
        }

        @Override
        public void execute(TupleWindow inputWindow) {
            // No-op for testing
        }

        @Override
        public void declareOutputFields(OutputFieldsDeclarer declarer) {
            declarer.declare(new Fields("field1"));
        }
    }

    /**
     * Test implementation of BaseRichSpout for testing purposes.
     */
    private static class TestRichSpout extends BaseRichSpout {
        private static final long serialVersionUID = 1L;

        @Override
        public void open(Map<String, Object> conf, TopologyContext context,
                         SpoutOutputCollector collector) {
            // No-op for testing
        }

        @Override
        public void nextTuple() {
            // No-op for testing
        }

        @Override
        public void declareOutputFields(OutputFieldsDeclarer declarer) {
            declarer.declare(new Fields("word"));
        }
    }
}