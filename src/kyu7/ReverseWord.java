package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWord {
    /**
     Complete the function that accepts a string parameter, and reverses each word in the string.
     All spaces in the string should be retained.
     */
    public static String reverseWords(final String original) {

        if(original.replace(" ", "").length() == 0) {
            return original;
        }

        StringBuilder sb = new StringBuilder();

        String[] arr = original.split(" ");

        for(String s : arr) {
            sb.append(s).reverse().append(" ");
        }

        return sb.toString().trim();
    }

    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWord.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWord.reverseWords("apple"));
        assertEquals("a b c d", ReverseWord.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWord.reverseWords("double  spaced  words"));
    }
}
