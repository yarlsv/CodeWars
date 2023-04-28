package kyu6;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsEncoder {

    private static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }
    public static String solution(int n) {

        int i = map.floorKey(n);
        if( i == n) {
            return map.get(i);
        }

        return map.get(i) + solution(n - i);
    }

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", RomanNumeralsEncoder.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", RomanNumeralsEncoder.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", RomanNumeralsEncoder.solution(6));
    }
}
