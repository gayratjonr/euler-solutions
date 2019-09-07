package solutuon;

import java.math.BigInteger;

public class Problem20 {
    public static void main(String[] args) {
        int sum = 0;
        String result = factorial(100);
        for (int i = 0; i < result.length(); i++) {
            sum += Character.getNumericValue(result.charAt(i));
        }
        System.out.println(sum);
    }

    private static String factorial(int maxNumber){
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= maxNumber; i++) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        return factorial.toString();
    }
}
