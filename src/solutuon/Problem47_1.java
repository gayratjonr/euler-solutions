package solutuon;

import java.util.Arrays;

public class Problem47_1 {
    public static void main(String[] args) {
        boolean resaultOne = false;
        boolean resaultTwo = false;
        boolean resaultThree = false;
        boolean resaultFour = false;

        boolean flag = true;
        int i = 130000;
        while (flag) {
            int k = i;
            if (countDevisors(k)
                    && countDevisors(k + 1)
                    && countDevisors(k + 2)
                    && countDevisors(k + 3)) {
                System.out.println(i);
                flag = false;
            }
            i++;
        }

    }

    private static boolean countDevisors(int number) {
        int count = 0;
        boolean[] primes = new boolean[100000];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; i++) {
            for (int j = i + i; j < primes.length; j += i) {
                primes[j] = false;
            }
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0 && primes[number / i]) {
                count++;
            }
        }
        return count == 4;
    }
}
