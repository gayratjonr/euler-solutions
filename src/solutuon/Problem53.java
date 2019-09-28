package solutuon;

import java.math.BigInteger;

public class Problem53 {
    public static void main(String[] args) {
        BigInteger[] fact = new BigInteger[101];
        BigInteger limit = new BigInteger("1000000");
        fact[0] = new BigInteger("1");
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1].multiply(new BigInteger("" + i));
        }

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                BigInteger com = fact[i].divide(fact[j].multiply(fact[i - j]));
                if (com.compareTo(limit) == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
