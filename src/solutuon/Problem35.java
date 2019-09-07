package solutuon;

import java.util.Arrays;

public class Problem35 {
    public static void main(String[] args) {
        int count = 0;
        boolean[] primes = new boolean[1000000];
        Arrays.fill(primes, true);

        for (int i = 2; i < 1000000; i++) {
            for (int j = i + i; j < 1000000; j += i) {
                primes[j] = false;
            }
        }

        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i, primes)) {
                count++;
            }
        }
        System.out.println(count);
    }


    private static boolean isPrime(int n, boolean[] a) {
        boolean result = false;
        String numberString = String.valueOf(n);
        String numberTemp = numberString;
        do {
            if (!a[Integer.valueOf(numberTemp)]) {
                result = false;
                break;
            }
            result = a[Integer.valueOf(numberTemp)];
            numberTemp = numberTemp.substring(1) + numberTemp.charAt(0);
        } while (!numberString.equals(numberTemp));
        return result;
    }
}
