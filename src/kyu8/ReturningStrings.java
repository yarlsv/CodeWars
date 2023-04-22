package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
 */
public class ReturningStrings {

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }
}
