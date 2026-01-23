package myTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) 100.0d, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 100.0 to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 10 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.storm.utils.ObjectReader.getInt(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert null to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 4 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.storm.utils.ObjectReader.getDouble(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert null to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 100.0 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) 0.0d, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 0.0 to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 1.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 1.0 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 10 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str1 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.storm.utils.ObjectReader.getLong((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert   to a long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 100 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.storm.utils.ObjectReader.getDouble((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert ( ) to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str1 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IWindowedBolt iWindowedBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer4 = topologyBuilder0.setBolt("hi!", iWindowedBolt2, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str1 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichSpout iRichSpout2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer4 = topologyBuilder0.setSpout("hi!", iRichSpout2, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichBolt iRichBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", iRichBolt2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichSpout iRichSpout2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer4 = topologyBuilder0.setSpout("hi!", iRichSpout2, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) 100.0f, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 100.0 to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichSpout iRichSpout2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer3 = topologyBuilder0.setSpout("hi!", iRichSpout2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str1 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichBolt iRichBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("", iRichBolt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IWindowedBolt iWindowedBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer4 = topologyBuilder0.setBolt("1", iWindowedBolt2, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        java.util.List<java.lang.String> strList7 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) tupleSerializableBiConsumer2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 0.0 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 1.0d, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 1.0 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 1.0 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichBolt iRichBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", iRichBolt2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IRichBolt iRichBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder0.setBolt("hi!", iRichBolt8, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichBolt iRichBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer4 = topologyBuilder0.setBolt("100", iRichBolt2, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichBolt iRichBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", iRichBolt2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IRichBolt iRichBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder0.setBolt("", iRichBolt8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.storm.utils.ObjectReader.getLong((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert # to a long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IBasicBolt iBasicBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("", iBasicBolt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert # to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichBolt iRichBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("1", iRichBolt2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.hooks.IWorkerHook iWorkerHook7 = null;
        // The following exception was thrown during execution in test generation
        try {
            topologyBuilder0.addWorkerHook(iWorkerHook7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: WorkerHook must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) topologyBuilder0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert org.apache.storm.topology.TopologyBuilder@74a08748 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IWindowedBolt iWindowedBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("1", iWindowedBolt2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 0.0f, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 0.0 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int5 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) topologyBuilder0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert org.apache.storm.topology.TopologyBuilder@5f77bac1 to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IBasicBolt iBasicBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("100", iBasicBolt5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer4 = topologyBuilder0.setBolt("1", tupleSerializableConsumer2, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 100L, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 100 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        java.lang.Class<?> wildcardClass1 = topologyBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("", iWindowedBolt5, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str1 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt("1", tupleSerializableConsumer14, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer17 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer14, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer4 = topologyBuilder0.setBolt("", tupleSerializableConsumer2, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        java.lang.Class<?> wildcardClass7 = boltDeclarer6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IRichBolt iRichBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder0.setBolt("1", iRichBolt8, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IBasicBolt iBasicBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("10", iBasicBolt2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder0.setBolt("", iWindowedBolt8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IRichSpout iRichSpout8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer9 = topologyBuilder0.setSpout(" ", iRichSpout8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.topology.IBasicBolt iBasicBolt14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt("hi!", iBasicBolt14, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichSpout iRichSpout5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer6 = topologyBuilder0.setSpout("100", iRichSpout5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) " ", (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) strArray9, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert [Ljava.lang.String;@635f608e to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.topology.IBasicBolt iBasicBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("", iBasicBolt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.topology.IBasicBolt iBasicBolt14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt("10", iBasicBolt14, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichBolt iRichBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", iRichBolt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.storm.utils.ObjectReader.getLong((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert true to a long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.topology.IRichBolt iRichBolt14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt(" ", iRichBolt14, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert a to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("10", iWindowedBolt5, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.topology.IRichSpout iRichSpout14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer16 = topologyBuilder0.setSpout("1", iRichSpout14, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.topology.IBasicBolt iBasicBolt14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt("100", iBasicBolt14, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichSpout iRichSpout2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer4 = topologyBuilder0.setSpout("", iRichSpout2, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) "100", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 100 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichSpout iRichSpout2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer4 = topologyBuilder0.setSpout(" ", iRichSpout2, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 10 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder0.setBolt("hi!", iWindowedBolt8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) true, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert true to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IBasicBolt iBasicBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder0.setBolt("1", iBasicBolt8, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) (byte) 1, "10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 1 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.topology.IRichSpout iRichSpout17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer19 = topologyBuilder0.setSpout("1", iRichSpout17, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder3 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder3.setBolt(" ", tupleSerializableBiConsumer5, strArray8);
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder0.setBolt("", tupleSerializableBiConsumer2, strArray8);
        org.apache.storm.topology.IBasicBolt iBasicBolt12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer14 = topologyBuilder0.setBolt(" ", iBasicBolt12, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(boltDeclarer9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) 10.0f, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 10.0 to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString(obj0, "10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert java.lang.Object@1830c2c8 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.topology.IBasicBolt iBasicBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("", iBasicBolt5, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("100", iWindowedBolt14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.storm.utils.ObjectReader objectReader0 = new org.apache.storm.utils.ObjectReader();
        java.lang.Class<?> wildcardClass1 = objectReader0.getClass();
        java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class org.apache.storm.utils.ObjectReader" + "'", str2, "class org.apache.storm.utils.ObjectReader");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IRichSpout iRichSpout8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer9 = topologyBuilder0.setSpout("hi!", iRichSpout8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.storm.utils.ObjectReader.getDouble(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert (java.lang.Object@170026e8) to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer17 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder19 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer21 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer25 = topologyBuilder19.setBolt(" ", tupleSerializableBiConsumer21, strArray24);
        java.lang.String str26 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer27 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer17, (java.lang.Number) (-1.0f), strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(boltDeclarer25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.generated.StormTopology stormTopology14 = topologyBuilder0.createTopology();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate field 'hi!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str1 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.storm.utils.ObjectReader objectReader0 = new org.apache.storm.utils.ObjectReader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = org.apache.storm.utils.ObjectReader.getLong((java.lang.Object) objectReader0, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert org.apache.storm.utils.ObjectReader@527e59aa to a long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        java.lang.String str7 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long9 = org.apache.storm.utils.ObjectReader.getLong((java.lang.Object) str7, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"[Ljava.lang.String;@1e066dca\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichBolt iRichBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("10", iRichBolt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder7 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder7.setBolt(" ", tupleSerializableBiConsumer9, strArray12);
        org.apache.storm.topology.BoltDeclarer boltDeclarer14 = topologyBuilder4.setBolt("", tupleSerializableBiConsumer6, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) (-1L), strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
        org.junit.Assert.assertNotNull(boltDeclarer14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.topology.IRichBolt iRichBolt2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer4 = topologyBuilder0.setBolt("100", iRichBolt2, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) 10.0f, "class org.apache.storm.utils.ObjectReader");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 10.0 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray11, "100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert [Ljava.lang.String;@2e93e4b9 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) stormTopology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.topology.IRichBolt iRichBolt6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer8 = topologyBuilder0.setBolt(" ", iRichBolt6, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer18 = topologyBuilder0.setBolt("100", tupleSerializableConsumer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("100", tupleSerializableConsumer5);
        org.apache.storm.hooks.IWorkerHook iWorkerHook7 = null;
        // The following exception was thrown during execution in test generation
        try {
            topologyBuilder0.addWorkerHook(iWorkerHook7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: WorkerHook must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichBolt iRichBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("hi!", iRichBolt5, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichSpout iRichSpout5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer6 = topologyBuilder0.setSpout("1", iRichSpout5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.topology.IBasicBolt iBasicBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", iBasicBolt5, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer6 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(boltDeclarer7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("100", tupleSerializableConsumer5);
        org.apache.storm.topology.IRichBolt iRichBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", iRichBolt8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("100", tupleSerializableConsumer5);
        java.lang.Class<?> wildcardClass7 = boltDeclarer6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) boltDeclarer6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert org.apache.storm.topology.TopologyBuilder$BoltGetter@14495db9 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder7 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer9 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder10 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder10.setBolt(" ", tupleSerializableBiConsumer12, strArray15);
        org.apache.storm.topology.BoltDeclarer boltDeclarer17 = topologyBuilder7.setBolt("", tupleSerializableBiConsumer9, strArray15);
        org.apache.storm.topology.BoltDeclarer boltDeclarer18 = topologyBuilder0.setBolt("hi!", tupleSerializableBiConsumer6, strArray15);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer21 = topologyBuilder0.setBolt("", iWindowedBolt20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(boltDeclarer16);
        org.junit.Assert.assertNotNull(boltDeclarer17);
        org.junit.Assert.assertNotNull(boltDeclarer18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double2 = org.apache.storm.utils.ObjectReader.getDouble((java.lang.Object) topologyBuilder0, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert (org.apache.storm.topology.TopologyBuilder@7674eee0) to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer17 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder18 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer24 = topologyBuilder18.setBolt(" ", tupleSerializableBiConsumer20, strArray23);
        org.apache.storm.topology.BoltDeclarer boltDeclarer25 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", tupleSerializableBiConsumer17, strArray23);
        org.apache.storm.topology.IBasicBolt iBasicBolt27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer29 = topologyBuilder0.setBolt("", iBasicBolt27, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(boltDeclarer24);
        org.junit.Assert.assertNotNull(boltDeclarer25);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 4 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer19 = topologyBuilder0.setBolt("100", tupleSerializableConsumer17, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) 0.0f, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 0.0 to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("100", tupleSerializableConsumer5);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder9 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer11 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder9.setBolt("", tupleSerializableConsumer11);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer14 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder15 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer21 = topologyBuilder15.setBolt(" ", tupleSerializableBiConsumer17, strArray20);
        org.apache.storm.topology.BoltDeclarer boltDeclarer22 = topologyBuilder9.setBolt("10", tupleSerializableBiConsumer14, strArray20);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { " ", " " };
        org.apache.storm.topology.BoltDeclarer boltDeclarer28 = topologyBuilder9.setBolt("class org.apache.storm.utils.ObjectReader", tupleSerializableBiConsumer24, strArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer29 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer8, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer6);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(boltDeclarer21);
        org.junit.Assert.assertNotNull(boltDeclarer22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(boltDeclarer28);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.String str5 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.apache.storm.topology.IBasicBolt iBasicBolt7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer8 = topologyBuilder0.setBolt("100", iBasicBolt7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("100", tupleSerializableConsumer5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double8 = org.apache.storm.utils.ObjectReader.getDouble((java.lang.Object) topologyBuilder0, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert (org.apache.storm.topology.TopologyBuilder@61890184) to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", iWindowedBolt8, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder7 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer9 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder10 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder10.setBolt(" ", tupleSerializableBiConsumer12, strArray15);
        org.apache.storm.topology.BoltDeclarer boltDeclarer17 = topologyBuilder7.setBolt("", tupleSerializableBiConsumer9, strArray15);
        org.apache.storm.topology.BoltDeclarer boltDeclarer18 = topologyBuilder0.setBolt("hi!", tupleSerializableBiConsumer6, strArray15);
        org.apache.storm.topology.IBasicBolt iBasicBolt20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer22 = topologyBuilder0.setBolt("1", iBasicBolt20, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(boltDeclarer16);
        org.junit.Assert.assertNotNull(boltDeclarer17);
        org.junit.Assert.assertNotNull(boltDeclarer18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        boolean boolean5 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) tupleSerializableConsumer2, false);
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer6 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) topologyBuilder0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert org.apache.storm.topology.TopologyBuilder@550a5ce8 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(boltDeclarer7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.String str5 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder0.setBolt("100", iWindowedBolt7, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder7 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder7.setBolt(" ", tupleSerializableBiConsumer9, strArray12);
        org.apache.storm.topology.BoltDeclarer boltDeclarer14 = topologyBuilder0.setBolt("hi!", tupleSerializableBiConsumer6, strArray12);
        org.apache.storm.topology.IRichBolt iRichBolt16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer18 = topologyBuilder0.setBolt("", iRichBolt16, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
        org.junit.Assert.assertNotNull(boltDeclarer14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("", tupleSerializableConsumer5, (java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.topology.IRichSpout iRichSpout8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer9 = topologyBuilder0.setSpout("10", iRichSpout8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double15 = org.apache.storm.utils.ObjectReader.getDouble((java.lang.Object) topologyBuilder0, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert (org.apache.storm.topology.TopologyBuilder@17b4d24e) to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer17 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder18 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer24 = topologyBuilder18.setBolt(" ", tupleSerializableBiConsumer20, strArray23);
        org.apache.storm.topology.BoltDeclarer boltDeclarer25 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", tupleSerializableBiConsumer17, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList26 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) boltDeclarer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(boltDeclarer24);
        org.junit.Assert.assertNotNull(boltDeclarer25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) "100");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.storm.utils.ObjectReader.getBoolean((java.lang.Object) "100", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert 100 to boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray11);
        org.apache.storm.hooks.IWorkerHook iWorkerHook14 = null;
        // The following exception was thrown during execution in test generation
        try {
            topologyBuilder0.addWorkerHook(iWorkerHook14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: WorkerHook must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert -1 to String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("1", tupleSerializableConsumer5, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        java.lang.String str7 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = org.apache.storm.utils.ObjectReader.getLong((java.lang.Object) strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert [Ljava.lang.String;@7f864aaf to a long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) boltDeclarer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert org.apache.storm.topology.TopologyBuilder$BoltGetter@3ffbea2 to int");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.generated.StormTopology stormTopology5 = topologyBuilder0.createTopology();
        org.apache.storm.topology.IRichSpout iRichSpout7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer8 = topologyBuilder0.setSpout("true", iRichSpout7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(stormTopology5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.topology.IRichSpout iRichSpout6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer7 = topologyBuilder0.setSpout("100", iRichSpout6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer17 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder18 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer24 = topologyBuilder18.setBolt(" ", tupleSerializableBiConsumer20, strArray23);
        org.apache.storm.topology.BoltDeclarer boltDeclarer25 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", tupleSerializableBiConsumer17, strArray23);
        java.lang.String str26 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(boltDeclarer24);
        org.junit.Assert.assertNotNull(boltDeclarer25);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.apache.storm.utils.ObjectReader.getBoolean(obj0, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichBolt iRichBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", iRichBolt5, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichSpout iRichSpout5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.SpoutDeclarer spoutDeclarer6 = topologyBuilder0.setSpout("1", iRichSpout5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder3 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder3.setBolt(" ", tupleSerializableBiConsumer5, strArray8);
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder0.setBolt("", tupleSerializableBiConsumer2, strArray8);
        org.apache.storm.topology.IRichBolt iRichBolt12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer14 = topologyBuilder0.setBolt("true", iRichBolt12, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(boltDeclarer9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double16 = org.apache.storm.utils.ObjectReader.getDouble((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert () to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder7 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer9 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder10 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder10.setBolt(" ", tupleSerializableBiConsumer12, strArray15);
        org.apache.storm.topology.BoltDeclarer boltDeclarer17 = topologyBuilder7.setBolt("", tupleSerializableBiConsumer9, strArray15);
        org.apache.storm.topology.BoltDeclarer boltDeclarer18 = topologyBuilder0.setBolt("hi!", tupleSerializableBiConsumer6, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.generated.StormTopology stormTopology19 = topologyBuilder0.createTopology();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate field 'hi!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(boltDeclarer16);
        org.junit.Assert.assertNotNull(boltDeclarer17);
        org.junit.Assert.assertNotNull(boltDeclarer18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder3 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder3.setBolt(" ", tupleSerializableBiConsumer5, strArray8);
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder0.setBolt("", tupleSerializableBiConsumer2, strArray8);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer14 = topologyBuilder0.setBolt("hi!", tupleSerializableConsumer12, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(boltDeclarer9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        java.lang.Class<?> wildcardClass4 = topologyBuilder0.getClass();
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray11);
        org.apache.storm.topology.IBasicBolt iBasicBolt15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt("100", iBasicBolt15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IBasicBolt.getComponentConfiguration()\" because \"this.bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.storm.utils.ObjectReader objectReader0 = new org.apache.storm.utils.ObjectReader();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) objectReader0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.topology.IRichBolt iRichBolt6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer8 = topologyBuilder0.setBolt("true", iRichBolt6, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.Class<?> wildcardClass5 = stormTopology4.getClass();
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.String str5 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer7 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder8 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer14 = topologyBuilder8.setBolt(" ", tupleSerializableBiConsumer10, strArray13);
        java.lang.String str15 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray13);
        org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer7, strArray13);
        java.lang.Long long17 = org.apache.storm.utils.ObjectReader.getLong((java.lang.Object) tupleSerializableBiConsumer7);
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(boltDeclarer14);
        org.junit.Assert.assertNotNull(boltDeclarer16);
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt(" ", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichBolt iRichBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", iRichBolt5, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer2, strArray5);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder9 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer11 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder13 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer19 = topologyBuilder13.setBolt(" ", tupleSerializableBiConsumer15, strArray18);
        java.lang.String str20 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray18);
        org.apache.storm.topology.BoltDeclarer boltDeclarer21 = topologyBuilder9.setBolt("100", tupleSerializableBiConsumer11, (java.lang.Number) 100.0d, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer22 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer8, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(boltDeclarer6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(boltDeclarer19);
        org.junit.Assert.assertNotNull(boltDeclarer21);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.String str5 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer7 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder9 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder9.setBolt(" ", tupleSerializableBiConsumer11, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer7, (java.lang.Number) (short) 0, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(boltDeclarer15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.String str5 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder0.setBolt("10", tupleSerializableConsumer7, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parallelism must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.generated.StormTopology stormTopology5 = topologyBuilder0.createTopology();
        org.apache.storm.hooks.IWorkerHook iWorkerHook6 = null;
        // The following exception was thrown during execution in test generation
        try {
            topologyBuilder0.addWorkerHook(iWorkerHook6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: WorkerHook must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(stormTopology5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("1", iWindowedBolt5, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer5 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer7 = topologyBuilder0.setBolt("", tupleSerializableConsumer5, (java.lang.Number) 10);
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.storm.utils.ObjectReader objectReader0 = new org.apache.storm.utils.ObjectReader();
        java.lang.Class<?> wildcardClass1 = objectReader0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) objectReader0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer2 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder4 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer10 = topologyBuilder4.setBolt(" ", tupleSerializableBiConsumer6, strArray9);
        java.lang.String str11 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray9);
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder0.setBolt("100", tupleSerializableBiConsumer2, (java.lang.Number) 100.0d, strArray9);
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer14 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer15 = topologyBuilder0.setBolt("", tupleSerializableConsumer14);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer17 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder18 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer24 = topologyBuilder18.setBolt(" ", tupleSerializableBiConsumer20, strArray23);
        org.apache.storm.topology.BoltDeclarer boltDeclarer25 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", tupleSerializableBiConsumer17, strArray23);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer28 = topologyBuilder0.setBolt("10", iWindowedBolt27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(boltDeclarer10);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(boltDeclarer24);
        org.junit.Assert.assertNotNull(boltDeclarer25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        org.apache.storm.generated.StormTopology stormTopology5 = topologyBuilder0.createTopology();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder0.setBolt("", tupleSerializableConsumer7, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bolt has already been declared for id ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(stormTopology5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert to string list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer12 = topologyBuilder6.setBolt(" ", tupleSerializableBiConsumer8, strArray11);
        org.apache.storm.topology.BoltDeclarer boltDeclarer13 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray11);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { " ", " " };
        org.apache.storm.topology.BoltDeclarer boltDeclarer19 = topologyBuilder0.setBolt("class org.apache.storm.utils.ObjectReader", tupleSerializableBiConsumer15, strArray18);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer21 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder23 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer25 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer29 = topologyBuilder23.setBolt(" ", tupleSerializableBiConsumer25, strArray28);
        org.apache.storm.topology.BoltDeclarer boltDeclarer30 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer21, (java.lang.Number) (short) 10, strArray28);
        java.lang.Class<?> wildcardClass31 = strArray28.getClass();
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(boltDeclarer12);
        org.junit.Assert.assertNotNull(boltDeclarer13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(boltDeclarer19);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(boltDeclarer29);
        org.junit.Assert.assertNotNull(boltDeclarer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.List<java.lang.String> strList1 = org.apache.storm.utils.ObjectReader.getStrings((java.lang.Object) "100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double2 = org.apache.storm.utils.ObjectReader.getDouble((java.lang.Object) strList1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to convert ([100]) to double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.String str5 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer7 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder8 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer14 = topologyBuilder8.setBolt(" ", tupleSerializableBiConsumer10, strArray13);
        java.lang.String str15 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) strArray13);
        org.apache.storm.topology.BoltDeclarer boltDeclarer16 = topologyBuilder0.setBolt(" ", tupleSerializableBiConsumer7, strArray13);
        org.apache.storm.hooks.IWorkerHook iWorkerHook17 = null;
        // The following exception was thrown during execution in test generation
        try {
            topologyBuilder0.addWorkerHook(iWorkerHook17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: WorkerHook must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(boltDeclarer14);
        org.junit.Assert.assertNotNull(boltDeclarer16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.generated.StormTopology stormTopology4 = topologyBuilder0.createTopology();
        java.lang.String str5 = org.apache.storm.utils.ObjectReader.getString((java.lang.Object) topologyBuilder0);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer7 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder8 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer10 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer11 = topologyBuilder8.setBolt("", tupleSerializableConsumer10);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer13 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder14 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer20 = topologyBuilder14.setBolt(" ", tupleSerializableBiConsumer16, strArray19);
        org.apache.storm.topology.BoltDeclarer boltDeclarer21 = topologyBuilder8.setBolt("10", tupleSerializableBiConsumer13, strArray19);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer23 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { " ", " " };
        org.apache.storm.topology.BoltDeclarer boltDeclarer27 = topologyBuilder8.setBolt("class org.apache.storm.utils.ObjectReader", tupleSerializableBiConsumer23, strArray26);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer29 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder31 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer33 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer37 = topologyBuilder31.setBolt(" ", tupleSerializableBiConsumer33, strArray36);
        org.apache.storm.topology.BoltDeclarer boltDeclarer38 = topologyBuilder8.setBolt(" ", tupleSerializableBiConsumer29, (java.lang.Number) (short) 10, strArray36);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer40 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder41 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer43 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer44 = topologyBuilder41.setBolt("100", tupleSerializableConsumer43);
        org.apache.storm.generated.StormTopology stormTopology45 = topologyBuilder41.createTopology();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer47 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder48 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer50 = null;
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer54 = topologyBuilder48.setBolt(" ", tupleSerializableBiConsumer50, strArray53);
        org.apache.storm.topology.BoltDeclarer boltDeclarer55 = topologyBuilder41.setBolt("hi!", tupleSerializableBiConsumer47, strArray53);
        org.apache.storm.topology.BoltDeclarer boltDeclarer56 = topologyBuilder8.setBolt("hi!", tupleSerializableBiConsumer40, strArray53);
        org.apache.storm.topology.BoltDeclarer boltDeclarer57 = topologyBuilder0.setBolt("1", tupleSerializableBiConsumer7, strArray53);
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(stormTopology4);
        org.junit.Assert.assertNotNull(boltDeclarer11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(boltDeclarer20);
        org.junit.Assert.assertNotNull(boltDeclarer21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(boltDeclarer27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(boltDeclarer37);
        org.junit.Assert.assertNotNull(boltDeclarer38);
        org.junit.Assert.assertNotNull(boltDeclarer44);
        org.junit.Assert.assertNotNull(stormTopology45);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(boltDeclarer54);
        org.junit.Assert.assertNotNull(boltDeclarer55);
        org.junit.Assert.assertNotNull(boltDeclarer56);
        org.junit.Assert.assertNotNull(boltDeclarer57);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("100", tupleSerializableConsumer2);
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer5 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder6 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer8 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer9 = topologyBuilder6.setBolt("", tupleSerializableConsumer8);
        org.apache.storm.generated.StormTopology stormTopology10 = topologyBuilder6.createTopology();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer12 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder13 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer15 = null;
        org.apache.storm.topology.TopologyBuilder topologyBuilder16 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableBiConsumer<org.apache.storm.tuple.Tuple, org.apache.storm.topology.BasicOutputCollector> tupleSerializableBiConsumer18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.storm.topology.BoltDeclarer boltDeclarer22 = topologyBuilder16.setBolt(" ", tupleSerializableBiConsumer18, strArray21);
        org.apache.storm.topology.BoltDeclarer boltDeclarer23 = topologyBuilder13.setBolt("", tupleSerializableBiConsumer15, strArray21);
        org.apache.storm.topology.BoltDeclarer boltDeclarer24 = topologyBuilder6.setBolt("hi!", tupleSerializableBiConsumer12, strArray21);
        org.apache.storm.topology.BoltDeclarer boltDeclarer25 = topologyBuilder0.setBolt("10", tupleSerializableBiConsumer5, strArray21);
        org.apache.storm.topology.IWindowedBolt iWindowedBolt27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer28 = topologyBuilder0.setBolt("10", iWindowedBolt27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IWindowedBolt.getTimestampExtractor()\" because \"bolt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
        org.junit.Assert.assertNotNull(boltDeclarer9);
        org.junit.Assert.assertNotNull(stormTopology10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(boltDeclarer22);
        org.junit.Assert.assertNotNull(boltDeclarer23);
        org.junit.Assert.assertNotNull(boltDeclarer24);
        org.junit.Assert.assertNotNull(boltDeclarer25);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.storm.topology.TopologyBuilder topologyBuilder0 = new org.apache.storm.topology.TopologyBuilder();
        org.apache.storm.lambda.SerializableConsumer<org.apache.storm.tuple.Tuple> tupleSerializableConsumer2 = null;
        org.apache.storm.topology.BoltDeclarer boltDeclarer3 = topologyBuilder0.setBolt("", tupleSerializableConsumer2);
        org.apache.storm.topology.IRichBolt iRichBolt5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.topology.BoltDeclarer boltDeclarer6 = topologyBuilder0.setBolt("hi!", iRichBolt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.storm.topology.IComponent.getComponentConfiguration()\" because \"component\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(boltDeclarer3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = org.apache.storm.utils.ObjectReader.getInt((java.lang.Object) " ", (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }
}

