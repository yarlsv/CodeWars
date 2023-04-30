package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringIncrementer {
    public static String stringIncrementer (String str) {

        if (str.length() == 0) {
            return "1";
        }

        char[] arr = str.toCharArray();
        int i = str.length() - 1;


        while (arr[i] > 47 && arr[i] < 58) {
            if(arr[i] != 57) {
                arr[i]++;
                return new String(arr);
            } else {
                arr[i] = 48;
                if(i - 1 < 0 || arr[i - 1] < 47 || arr[i - 1] > 58) {
                    char[] newArr = new char[arr.length - i + 1];
                    System.arraycopy(arr, i, newArr, 1, arr.length - i);
                    newArr[0] = 49;
                    return str.substring(0, i) + new String(newArr);
                } else {
                    if (i > 0) {
                        i--;
                    }
                }
            }
        }

        return new String(arr) + 1;

    }

    @Test
    public void exampleTests() {
        assertEquals("foobar001", stringIncrementer("foobar000"));
        assertEquals("foo1", stringIncrementer("foo"));
        assertEquals("foobar002", stringIncrementer("foobar001"));
        assertEquals("foobar100", stringIncrementer("foobar99"));
        assertEquals("foobar100", stringIncrementer("foobar099"));
        assertEquals("1", stringIncrementer(""));
        assertEquals("2", stringIncrementer("1"));

    }
}
