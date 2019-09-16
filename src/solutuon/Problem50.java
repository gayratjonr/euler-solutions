package solutuon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem50 {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1000];
        Arrays.fill(primes, true);
        for (int i = 2; i < 1000; i++) {
            for (int j = i + i; j < 1000; j += i) {
                primes[j] = false;
            }
        }
        int sum = 0;
        int i = 200;
        List<Integer> list = new ArrayList<>();
        while (sum < 1000) {
            if (primes[i]) {
                sum += i;
            }
            i++;
            if (sum < 1000 && primes[sum]) {
                System.out.println(sum);
            }
        }
    }
}
