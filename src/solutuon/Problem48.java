package solutuon;

import java.math.BigInteger;

public class Problem48 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i = 1; i <= 1000 ; i++) {
            BigInteger integer = new BigInteger(""+ i);
            bigInteger = bigInteger.add(integer.pow(i));
        }
        String str  = bigInteger.toString();
        System.out.println(str.substring(str.length()-10, str.length()));
    }
}
