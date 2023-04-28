package kyu6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MexicanWave {

    public static String[] wave(String str) {
        String[] result = new String[str.length()];

        for(int i = 0; i < str.length(); i++) {
            String[] arr = str.split("");
            if (arr[i].equals(" ")) {
                continue;
            }
            arr[i] = arr[i].toUpperCase();

            String s = String.join("", arr);
            result[i] = s;
        }
        return Arrays.stream(result)
                .filter(n -> n != null)
                .toArray(String[]::new);
    }


    @Test
    public void basicTest1() {
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals(result, MexicanWave.wave("hello"));
    }

    @Test
    public void basicTest2() {
        String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals(result, MexicanWave.wave("codewars"));
    }
    @Test
    public void basicTest4() {
        String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        assertArrayEquals(result, MexicanWave.wave("two words"));
    }

    @Test
    public void basicTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals(result, MexicanWave.wave(" gap "));
    }
}
