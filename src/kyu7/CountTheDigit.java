package kyu7;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDigit {

    public static int nbDig(int n, int d) {
        String regex = String.format("[^%d]", d);

        List<String> list = IntStream.range(0, n + 1)
                .map(x -> x * x)
                .mapToObj(String::valueOf)
                .map(x -> x.replaceAll(regex, ""))
                .toList();
        return list.stream()
                .map(x -> x.length())
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests nbDig");
        assertEquals(11, CountTheDigit.nbDig(25, 1));
        assertEquals(CountTheDigit.nbDig(11011, 2), 9481);
        assertEquals(CountTheDigit.nbDig(12224, 8), 7733);
        assertEquals(CountTheDigit.nbDig(11549, 1), 11905);
    }
}
