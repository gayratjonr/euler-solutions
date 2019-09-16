package solutuon;

import java.util.Arrays;

public class Problem37 {
    public static void main(String[] args) {
        boolean[] primes = new boolean[3797];
        Arrays.fill(primes, true);
        for (int i = 11; i < 3797 ; i++) {
            for (int j = i +i; j < 3797; j+=i) {
                primes[j] = false;
            }
        }

    }
}
