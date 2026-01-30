package myTests;

import org.apache.storm.utils.ObjectReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link ObjectReader} class.
 * This class provides utility methods for converting objects to various types.
 */
public class ObjectReaderZeroShotTest {

    // ==================== getString tests ====================

    @Test(expected = IllegalArgumentException.class)
    public void testGetStringWithNullThrowsException() {
        ObjectReader.getString(null);
    }

    @Test
    public void testGetStringWithStringReturnsString() {
        assertEquals("hello", ObjectReader.getString("hello"));
    }

    @Test
    public void testGetStringWithEmptyStringReturnsEmptyString() {
        assertEquals("", ObjectReader.getString(""));
    }

    @Test
    public void testGetStringWithIntegerReturnsStringRepresentation() {
        assertEquals("123", ObjectReader.getString(123));
    }

    @Test
    public void testGetStringWithLongReturnsStringRepresentation() {
        assertEquals("9876543210", ObjectReader.getString(9876543210L));
    }

    @Test
    public void testGetStringWithDoubleReturnsStringRepresentation() {
        String result = ObjectReader.getString(3.14);
        assertTrue(result.startsWith("3.14"));
    }

    @Test
    public void testGetStringWithBooleanReturnsStringRepresentation() {
        assertEquals("true", ObjectReader.getString(true));
        assertEquals("false", ObjectReader.getString(false));
    }

    // ==================== getString with default value tests ====================

    @Test
    public void testGetStringWithDefaultWhenNullReturnsDefault() {
        assertEquals("default", ObjectReader.getString(null, "default"));
    }

    @Test
    public void testGetStringWithDefaultWhenNotNullReturnsValue() {
        assertEquals("value", ObjectReader.getString("value", "default"));
    }

    @Test
    public void testGetStringWithDefaultWhenEmptyStringReturnsEmptyString() {
        assertEquals("", ObjectReader.getString("", "default"));
    }

    @Test
    public void testGetStringWithNullDefault() {
        assertNull(ObjectReader.getString(null, null));
    }

    // ==================== getInt tests ====================

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithNullThrowsException() {
        ObjectReader.getInt(null);
    }

    @Test
    public void testGetIntWithIntegerReturnsInteger() {
        assertEquals(Integer.valueOf(42), ObjectReader.getInt(42));
    }

    @Test
    public void testGetIntWithLongReturnsInteger() {
        assertEquals(Integer.valueOf(100), ObjectReader.getInt(100L));
    }

    @Test
    public void testGetIntWithShortReturnsInteger() {
        assertEquals(Integer.valueOf(50), ObjectReader.getInt((short) 50));
    }

    @Test
    public void testGetIntWithByteReturnsInteger() {
        assertEquals(Integer.valueOf(25), ObjectReader.getInt((byte) 25));
    }

    @Test
    public void testGetIntWithStringReturnsInteger() {
        assertEquals(Integer.valueOf(999), ObjectReader.getInt("999"));
    }

    @Test
    public void testGetIntWithNegativeIntegerReturnsNegativeInteger() {
        assertEquals(Integer.valueOf(-42), ObjectReader.getInt(-42));
    }

    @Test
    public void testGetIntWithZeroReturnsZero() {
        assertEquals(Integer.valueOf(0), ObjectReader.getInt(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithDoubleThrowsException() {
        // Double values are not supported for int conversion
        ObjectReader.getInt(10.9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithFloatThrowsException() {
        // Float values are not supported for int conversion
        ObjectReader.getInt(15.7f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithInvalidStringThrowsException() {
        ObjectReader.getInt("not a number");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithNonConvertibleObjectThrowsException() {
        ObjectReader.getInt(new Object());
    }

    // ==================== getInt with default value tests ====================

    @Test
    public void testGetIntWithDefaultWhenNullReturnsDefault() {
        assertEquals(Integer.valueOf(100), ObjectReader.getInt(null, 100));
    }

    @Test
    public void testGetIntWithDefaultWhenNotNullReturnsValue() {
        assertEquals(Integer.valueOf(42), ObjectReader.getInt(42, 100));
    }

    @Test
    public void testGetIntWithNullDefault() {
        assertNull(ObjectReader.getInt(null, null));
    }

    @Test
    public void testGetIntWithDefaultWhenStringReturnsValue() {
        assertEquals(Integer.valueOf(55), ObjectReader.getInt("55", 100));
    }

    // ==================== getLong tests ====================

    @Test
    public void testGetLongWithNullReturnsNull() {
        assertNull(ObjectReader.getLong(null));
    }

    @Test
    public void testGetLongWithLongReturnsLong() {
        assertEquals(Long.valueOf(9876543210L), ObjectReader.getLong(9876543210L));
    }

    @Test
    public void testGetLongWithIntegerReturnsLong() {
        assertEquals(Long.valueOf(42L), ObjectReader.getLong(42));
    }

    @Test
    public void testGetLongWithShortReturnsLong() {
        assertEquals(Long.valueOf(50L), ObjectReader.getLong((short) 50));
    }

    @Test
    public void testGetLongWithByteReturnsLong() {
        assertEquals(Long.valueOf(25L), ObjectReader.getLong((byte) 25));
    }

    @Test
    public void testGetLongWithStringReturnsLong() {
        assertEquals(Long.valueOf(123456789L), ObjectReader.getLong("123456789"));
    }

    @Test
    public void testGetLongWithNegativeLongReturnsNegativeLong() {
        assertEquals(Long.valueOf(-9876543210L), ObjectReader.getLong(-9876543210L));
    }

    @Test
    public void testGetLongWithZeroReturnsZero() {
        assertEquals(Long.valueOf(0L), ObjectReader.getLong(0L));
    }

    @Test
    public void testGetLongWithDoubleReturnsLong() {
        assertEquals(Long.valueOf(10L), ObjectReader.getLong(10.9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLongWithInvalidStringThrowsException() {
        ObjectReader.getLong("not a number");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLongWithNonConvertibleObjectThrowsException() {
        ObjectReader.getLong(new Object());
    }

    // ==================== getLong with default value tests ====================

    @Test
    public void testGetLongWithDefaultWhenNullReturnsDefault() {
        assertEquals(Long.valueOf(1000L), ObjectReader.getLong(null, 1000L));
    }

    @Test
    public void testGetLongWithDefaultWhenNotNullReturnsValue() {
        assertEquals(Long.valueOf(42L), ObjectReader.getLong(42L, 1000L));
    }

    @Test
    public void testGetLongWithNullDefault() {
        assertNull(ObjectReader.getLong(null, null));
    }

    // ==================== getDouble tests ====================

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithNullThrowsException() {
        ObjectReader.getDouble(null);
    }

    @Test
    public void testGetDoubleWithDoubleReturnsDouble() {
        assertEquals(Double.valueOf(3.14159), ObjectReader.getDouble(3.14159));
    }

    @Test
    public void testGetDoubleWithIntegerReturnsDouble() {
        assertEquals(Double.valueOf(42.0), ObjectReader.getDouble(42));
    }

    @Test
    public void testGetDoubleWithLongReturnsDouble() {
        assertEquals(Double.valueOf(9876543210.0), ObjectReader.getDouble(9876543210L));
    }

    @Test
    public void testGetDoubleWithFloatReturnsDouble() {
        Double result = ObjectReader.getDouble(3.14f);
        assertNotNull(result);
        assertEquals(3.14, result, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithStringThrowsException() {
        // String values are not supported for double conversion
        ObjectReader.getDouble("123.456");
    }

    @Test
    public void testGetDoubleWithNegativeDoubleReturnsNegativeDouble() {
        assertEquals(Double.valueOf(-3.14), ObjectReader.getDouble(-3.14));
    }

    @Test
    public void testGetDoubleWithZeroReturnsZero() {
        assertEquals(Double.valueOf(0.0), ObjectReader.getDouble(0.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithInvalidStringThrowsException() {
        ObjectReader.getDouble("not a number");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithNonConvertibleObjectThrowsException() {
        ObjectReader.getDouble(new Object());
    }

    // ==================== getDouble with default value tests ====================

    @Test
    public void testGetDoubleWithDefaultWhenNullReturnsDefault() {
        assertEquals(Double.valueOf(99.99), ObjectReader.getDouble(null, 99.99));
    }

    @Test
    public void testGetDoubleWithDefaultWhenNotNullReturnsValue() {
        assertEquals(Double.valueOf(3.14), ObjectReader.getDouble(3.14, 99.99));
    }

    @Test
    public void testGetDoubleWithNullDefault() {
        assertNull(ObjectReader.getDouble(null, null));
    }

    // ==================== getBoolean tests ====================

    @Test
    public void testGetBooleanWithNullReturnsDefault() {
        assertTrue(ObjectReader.getBoolean(null, true));
        assertFalse(ObjectReader.getBoolean(null, false));
    }

    @Test
    public void testGetBooleanWithBooleanTrueReturnsTrue() {
        assertTrue(ObjectReader.getBoolean(Boolean.TRUE, false));
    }

    @Test
    public void testGetBooleanWithBooleanFalseReturnsFalse() {
        assertFalse(ObjectReader.getBoolean(Boolean.FALSE, true));
    }

    @Test
    public void testGetBooleanWithPrimitiveTrueReturnsTrue() {
        assertTrue(ObjectReader.getBoolean(true, false));
    }

    @Test
    public void testGetBooleanWithPrimitiveFalseReturnsFalse() {
        assertFalse(ObjectReader.getBoolean(false, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithStringTrueThrowsException() {
        // String values are not supported for boolean conversion
        ObjectReader.getBoolean("true", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithStringFalseThrowsException() {
        // String values are not supported for boolean conversion
        ObjectReader.getBoolean("false", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithStringTrueUpperCaseThrowsException() {
        // String values are not supported for boolean conversion
        ObjectReader.getBoolean("TRUE", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithStringFalseUpperCaseThrowsException() {
        // String values are not supported for boolean conversion
        ObjectReader.getBoolean("FALSE", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithInvalidStringThrowsException() {
        ObjectReader.getBoolean("invalid", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithNonConvertibleObjectThrowsException() {
        ObjectReader.getBoolean(new Object(), false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithIntegerThrowsException() {
        // Integers should not be convertible to boolean
        ObjectReader.getBoolean(1, false);
    }

    // ==================== getStrings tests ====================

    @Test
    public void testGetStringsWithNullReturnsEmptyList() {
        List<String> result = ObjectReader.getStrings(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetStringsWithStringListReturnsList() {
        List<String> input = Arrays.asList("a", "b", "c");
        List<String> result = ObjectReader.getStrings(input);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
        assertEquals("c", result.get(2));
    }

    @Test
    public void testGetStringsWithEmptyListReturnsEmptyList() {
        List<String> input = Collections.emptyList();
        List<String> result = ObjectReader.getStrings(input);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetStringsWithListContainingNullsIgnoresNulls() {
        List<String> input = Arrays.asList("a", null, "c");
        List<String> result = ObjectReader.getStrings(input);
        assertEquals(2, result.size());
        assertEquals("a", result.get(0));
        assertEquals("c", result.get(1));
    }

    @Test
    public void testGetStringsWithSingleStringReturnsListWithOneElement() {
        // When passed a single string, it should return a list containing that string
        List<String> result = ObjectReader.getStrings("single");
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("single", result.get(0));
    }

    @Test
    public void testGetStringsWithMixedTypeListConvertsToStrings() {
        List<Object> input = Arrays.asList("string", 123, 45.67);
        List<String> result = ObjectReader.getStrings(input);
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("string", result.get(0));
        assertEquals("123", result.get(1));
        assertTrue(result.get(2).startsWith("45.67"));
    }

    @Test
    public void testGetStringsWithListContainingOnlyNullsReturnsEmptyList() {
        List<String> input = Arrays.asList(null, null, null);
        List<String> result = ObjectReader.getStrings(input);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetStringsWithArrayListReturnsList() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("x", "y", "z"));
        List<String> result = ObjectReader.getStrings(input);
        assertEquals(3, result.size());
    }

    // ==================== Edge case tests ====================

    @Test
    public void testGetIntWithMaxIntegerValue() {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), ObjectReader.getInt(Integer.MAX_VALUE));
    }

    @Test
    public void testGetIntWithMinIntegerValue() {
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), ObjectReader.getInt(Integer.MIN_VALUE));
    }

    @Test
    public void testGetLongWithMaxLongValue() {
        assertEquals(Long.valueOf(Long.MAX_VALUE), ObjectReader.getLong(Long.MAX_VALUE));
    }

    @Test
    public void testGetLongWithMinLongValue() {
        assertEquals(Long.valueOf(Long.MIN_VALUE), ObjectReader.getLong(Long.MIN_VALUE));
    }

    @Test
    public void testGetDoubleWithPositiveInfinity() {
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), ObjectReader.getDouble(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testGetDoubleWithNegativeInfinity() {
        assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), ObjectReader.getDouble(Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testGetDoubleWithNaN() {
        Double result = ObjectReader.getDouble(Double.NaN);
        assertNotNull(result);
        assertTrue(result.isNaN());
    }

    @Test
    public void testGetStringWithWhitespace() {
        assertEquals("  whitespace  ", ObjectReader.getString("  whitespace  "));
    }

    //Sostituisc il test "testGetIntWithWhitespaceStringMayFail" con uno deterministico, aspettandomi un'eccezione
    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithWhitespaceStringThrowsException() {
        ObjectReader.getInt("  47  ");
    }

    // stesso principio per long
    @Test(expected = IllegalArgumentException.class)
    public void testGetLongWithWhitespaceStringThrowsException() {
        ObjectReader.getLong("  47  ");
    }

    @Test
    public void testGetIntWithNegativeStringValue() {
        assertEquals(Integer.valueOf(-123), ObjectReader.getInt("-123"));
    }

    @Test
    public void testGetLongWithNegativeStringValue() {
        assertEquals(Long.valueOf(-9876543210L), ObjectReader.getLong("-9876543210"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithNegativeStringValueThrowsException() {
        // String values are not supported for double conversion
        ObjectReader.getDouble("-123.456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithScientificNotationStringThrowsException() {
        // String values are not supported for double conversion
        ObjectReader.getDouble("1.23E4");
    }

    // ==================== Constructor test ====================

    @Test
    public void testObjectReaderInstantiation() {
        // ObjectReader should be instantiable even though all methods are static
        ObjectReader reader = new ObjectReader();
        assertNotNull(reader);
    }

    // ==================== Type conversion boundary tests ====================

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithLongMaxValueThrowsException() {
        // Long.MAX_VALUE cannot be safely converted to int
        ObjectReader.getInt(Long.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntFromDoubleThrowsException() {
        // Double values are not supported for int conversion
        ObjectReader.getInt(5.9);
    }

    @Test
    public void testGetLongFromDoubleTruncatesFractionalPart() {
        // ObjectReader.getLong supports Double input by truncating the fractional part.
        assertEquals(Long.valueOf(5L), ObjectReader.getLong(5.9));
    }

    // ==================== String parsing tests ====================

    @Test
    public void testGetIntWithNumericStringZero() {
        assertEquals(Integer.valueOf(0), ObjectReader.getInt("0"));
    }

    @Test
    public void testGetLongWithNumericStringZero() {
        assertEquals(Long.valueOf(0L), ObjectReader.getLong("0"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithNumericStringZeroThrowsException() {
        // String values are not supported for double conversion
        ObjectReader.getDouble("0");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithEmptyStringThrowsException() {
        ObjectReader.getInt("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLongWithEmptyStringThrowsException() {
        ObjectReader.getLong("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDoubleWithEmptyStringThrowsException() {
        ObjectReader.getDouble("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanWithEmptyStringThrowsException() {
        ObjectReader.getBoolean("", false);
    }

    // ==================== Number subclass tests ====================

    @Test(expected = IllegalArgumentException.class)
    public void testGetIntWithWholeNumberDoubleThrowsException() {
        // Double values are not supported for int conversion even if they represent whole numbers
        ObjectReader.getInt(100.0);
    }

    @Test
    public void testGetLongWithWholeNumberDoubleReturnsLong() {
        // Whole-number doubles are also supported.
        assertEquals(Long.valueOf(100L), ObjectReader.getLong(100.0));
    }

    // ==================== Default value edge cases ====================

    @Test
    public void testGetIntWithDefaultZero() {
        assertEquals(Integer.valueOf(0), ObjectReader.getInt(null, 0));
    }

    @Test
    public void testGetLongWithDefaultZero() {
        assertEquals(Long.valueOf(0L), ObjectReader.getLong(null, 0L));
    }

    @Test
    public void testGetDoubleWithDefaultZero() {
        assertEquals(Double.valueOf(0.0), ObjectReader.getDouble(null, 0.0));
    }

    @Test
    public void testGetBooleanWithDefaultTrue() {
        assertTrue(ObjectReader.getBoolean(null, true));
    }

    @Test
    public void testGetBooleanWithDefaultFalse() {
        assertFalse(ObjectReader.getBoolean(null, false));
    }

    @Test
    public void testGetStringWithDefaultEmptyString() {
        assertEquals("", ObjectReader.getString(null, ""));
    }

    // ==================== List edge case tests ====================

    @Test
    public void testGetStringsWithSingleNullElement() {
        List<String> input = Collections.singletonList(null);
        List<String> result = ObjectReader.getStrings(input);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetStringsWithEmptyStrings() {
        List<String> input = Arrays.asList("", "", "");
        List<String> result = ObjectReader.getStrings(input);
        assertEquals(3, result.size());
        for (String s : result) {
            assertEquals("", s);
        }
    }

    @Test
    public void testGetStringsPreservesOrder() {
        List<String> input = Arrays.asList("first", "second", "third", "fourth");
        List<String> result = ObjectReader.getStrings(input);
        assertEquals(4, result.size());
        assertEquals("first", result.get(0));
        assertEquals("second", result.get(1));
        assertEquals("third", result.get(2));
        assertEquals("fourth", result.get(3));
    }
}