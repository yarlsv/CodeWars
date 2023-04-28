package kyu6;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            if (isSumDigPower(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isSumDigPower(long n) {
        int sum = 0;
        int power = 1;
        for (char c : String.valueOf(n).toCharArray()) {
            sum += Math.pow(Integer.parseInt(String.valueOf(c)), power++);
        }
        return sum == n;
    }

    public static void main(String[] args) {
        SumDigPower sumDigPower = new SumDigPower();
        System.out.println(sumDigPower.sumDigPow(1, 10));
    }
}
