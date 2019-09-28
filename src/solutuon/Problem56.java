package solutuon;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem56 {
    public static void main(String[] args) {
        int max= 0;
        long begin = System.currentTimeMillis();
        List<BigInteger> list = new ArrayList<>();
        for (int i = 80; i < 100; i++) {
            for (int j = 80; j < 100; j++) {
                BigInteger integer = new BigInteger("" + i);
                list.add(integer.pow(j));
            }
        }

        for (BigInteger bigInteger : list) {
            String str = bigInteger.toString();
           int  sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
            if (sum > max){
                max = sum;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(max);
        System.out.println(end-begin);
    }
}
