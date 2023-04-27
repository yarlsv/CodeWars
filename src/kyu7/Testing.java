package kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class Testing {

    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            result.add(i+1 + ": " + lines.get(i));
        }

        return result;
    }

    @Test
    public void basicTests() {
        assertIterableEquals(Arrays.asList(), Testing.number(Arrays.asList()));
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"), Testing.number(Arrays.asList("a", "b", "c")));
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), Testing.number(Arrays.asList("", "", "", "", "")));
    }
}
