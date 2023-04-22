package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implement a function which convert the given boolean value into its string representation.
 */
public class BooleanToString {

    public static String convert(boolean b) {
        return String.valueOf(b);
    }
    @Test
    void testTrue(){
        assertEquals("true", BooleanToString.convert(true));
    }

    @Test
    void testFalse(){
        assertEquals("false", BooleanToString.convert(false));
    }
}
