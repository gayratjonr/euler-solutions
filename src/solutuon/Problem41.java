package solutuon;

import java.util.Arrays;

public class Problem41 {
    public static void main(String[] args) {
        boolean[] primes = getPrimeList();
        for (int i = 7999999-1; i >= 1; i--) {
            if (primes[i] && isPandiget("" +  i)) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean[] getPrimeList() {
        boolean[] primes = new boolean[7999999];
        Arrays.fill(primes, true);
        for (int i = 2; i < primes.length; i++) {
            for (int j = i + i; j < primes.length; j += i) {
                primes[j] = false;
            }
        }
        return primes;
    }

    private static boolean isPandiget(String number) {
        boolean[] a = new boolean[number.length()];
        boolean flag = true;
        for (int i = 0; i < number.length(); i++) {
            int value = Character.getNumericValue(number.charAt(i));
            if (value <= number.length()) {
                if ((value == 0 || a[value - 1])) {
                    flag = false;
                    break;
                } else {
                    a[value - 1] = true;
                }
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
