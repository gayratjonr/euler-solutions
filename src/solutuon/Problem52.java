package solutuon;

import java.util.Arrays;

public class Problem52 {
    public static void main(String[] args) {
        int i = 10000;
        boolean flag = true;
        while (flag) {
            if (isPadegit(i, i * 2)
                    && isPadegit(i, i * 3)
                    && isPadegit(i, i * 4)
                    && isPadegit(i, i * 5)
                    && isPadegit(i, i * 6)) {
                System.out.println(i);
                flag = false;
            }
            i++;
        }
    }

    private static boolean isPadegit(int oneNumber, int secondNumber) {
        String strOneNumber = "" + oneNumber;
        String strSecondNumber = "" + secondNumber;
        if (strOneNumber.length() != strSecondNumber.length()) {
            return false;
        }
        char[] one = strOneNumber.toCharArray();
        char[] second = strSecondNumber.toCharArray();
        Arrays.sort(one);
        Arrays.sort(second);
        System.out.println(new String(one) +" " + oneNumber);
        if (new String(one).equals(new String(second))) {
            return true;
        }

        return false;
    }
}
