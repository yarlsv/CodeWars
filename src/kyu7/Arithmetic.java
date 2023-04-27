package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arithmetic {

    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    throw new ArithmeticException("b is equals to 0");
                }
                return a / b;
        }
        throw new IllegalArgumentException("Input data is not valid");
    }

    @Test
    public void testBasic() {
        assertEquals( 3, Arithmetic.arithmetic(1, 2, "add"));
        assertEquals(6, Arithmetic.arithmetic(8, 2, "subtract"));
        assertEquals(10, Arithmetic.arithmetic(5, 2, "multiply"));
        assertEquals(4, Arithmetic.arithmetic(8, 2, "divide"));
    }
}
