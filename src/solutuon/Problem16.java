package solutuon;

import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("2");
        String numberStr = number.pow(1000).toString();
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }
        System.out.println(sum);
    }
}
