package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given a list of integers, determine whether the sum of its elements is odd or even.
 * Give your answer as a string matching "odd" or "even".
 */
public class OddOrEven {

    public static String oddOrEven(int[] array) {
        int sum = Arrays.stream(array)
                .sum();

        return sum % 2 == 0 ? "even" : "odd";
    }

    @Test
    public void test() {
        assertEquals("even", oddOrEven(new int[]{0, 1, 5}));
    }
}
