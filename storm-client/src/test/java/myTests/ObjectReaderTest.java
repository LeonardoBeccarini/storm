package myTests;

import org.apache.storm.utils.ObjectReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ObjectReaderTest {

    @Parameterized.Parameter()
    public Object o;

    @Parameterized.Parameter(1)
    public Integer defaultValue;

    @Parameterized.Parameter(2)
    public Integer expectedValue;

    @Parameterized.Parameter(3)
    public Class<? extends Throwable> expectedException;

    @Parameterized.Parameters(name = "{index}: getInt({0}, {1}) => value={2}, expected={3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // --- Casi NO-ERROR / SUCCESS (include null con default) ---
                { null, null, null, null },                                // T1 (no exception; spesso ritorna null)
                { null, -1, -1, null },                                    // T2
                { null, 0, 0, null },                                      // T3
                { null, 1, 1, null },                                      // T4
                { 1, 0, 1, null },                                         // T5
                { (short) 1, 0, 1, null },                                 // T6
                { (byte) 1, 0, 1, null },                                  // T7
                { (long) 1, 0, 1, null },                                  // T8
                { (long) Integer.MAX_VALUE, 1, Integer.MAX_VALUE, null },  // T9
                { (long) Integer.MIN_VALUE, 1, Integer.MIN_VALUE, null },  // T10
                { "1", 0, 1, null },                                       // T20
                { "2147483647", 0, Integer.MAX_VALUE, null },              // T21
                { "-2147483648", 0, Integer.MIN_VALUE, null },             // T22

                // --- Casi ERROR / EXCEPTION ---
                { (long) Integer.MAX_VALUE + 1L, 1, null, IllegalArgumentException.class }, // T11
                { (long) Integer.MIN_VALUE - 1L, 1, null, IllegalArgumentException.class }, // T12

                { (double) Integer.MAX_VALUE + 1D, 1, null, IllegalArgumentException.class }, // T16
                { (double) Integer.MIN_VALUE - 1D, 1, null, IllegalArgumentException.class }, // T17
                { 2.3F, 1, null, IllegalArgumentException.class },                             // T18
                { 1.1D, 1, null, IllegalArgumentException.class },                             // T19

                { "2147483648", 1, null, NumberFormatException.class },   // overflow string
                { "-2147483649", 1, null, NumberFormatException.class },  // underflow string
                { "1.2", 1, null, NumberFormatException.class },          // string non intera
                { "Stringa", 1, null, NumberFormatException.class },      // string non numerica
        });
    }

    @Test
    public void testGetInt_withDefault() {
        try {
            Integer result = ObjectReader.getInt(o, defaultValue);

            // Se mi aspettavo un'eccezione, ma non è arrivata => fail
            if (expectedException != null) {
                fail("Expected exception " + expectedException.getName() + " but no exception was thrown.");
            }

            // Altrimenti verifico risultato
            assertEquals(expectedValue, result);
            if (result != null) {
                assertEquals(Integer.class, result.getClass());
            }

        } catch (Throwable t) {
            // Se non mi aspettavo eccezioni, rilancio (JUnit lo considera errore)
            if (expectedException == null) {
                throw t;
            }
            // Eccezione attesa: controllo tipo esatto
            assertEquals(expectedException, t.getClass());
        }
    }
}
