package solutuon;

import java.math.BigInteger;

public class Problem25 {
    public static void main(String[] args) {
        BigInteger f1 = BigInteger.ONE;
        BigInteger f2 = BigInteger.ONE;
        BigInteger f3 = BigInteger.ZERO;
        int count = 2;
        while (f3.toString().length() < 1000){
            f3 = f1.add(f2);
            f1 = f2;
            f2 =  f3;
            count++;
        }
        System.out.println(count);
    }
}
