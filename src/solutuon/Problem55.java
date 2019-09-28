package solutuon;

import java.math.BigInteger;

public class Problem55 {
    static int sum = 0;

    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            check(i);
        }
        System.out.println(sum);
    }

    static void check(int n) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        for (int i = 0; i < 100; i++) {
            bigInteger = bigInteger.add(reverse(bigInteger));
            if (isPalindrome(bigInteger)) {
                return;
            }
        }
        sum++;
    }

    static BigInteger reverse(BigInteger bigInteger) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bigInteger.toString());
        stringBuilder.reverse();
        return new BigInteger(stringBuilder.toString());
    }

    static boolean isPalindrome(BigInteger bigInteger) {
        return reverse(bigInteger).equals(bigInteger);
    }
}
