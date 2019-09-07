package solutuon;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Problem29 {
    public static void main(String[] args) {
        Set<BigDecimal> set = new HashSet<>();
        for (int i = 2; i <=100; i++) {
            for (int j = 2; j <= 100; j++) {
                BigDecimal bigInteger = new BigDecimal(Math.pow(i,j));
                set.add(bigInteger);
            }
        }
        System.out.println(set.size());
    }
}
