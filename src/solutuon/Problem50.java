package solutuon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem50 {
    public static void main(String[] args) {
        sum(1);
    }


    private static boolean[] getPrimes() {
        boolean[] primes = new boolean[1000000];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < 1000000; i++) {
            for (int j = i + i; j < 1000000; j += i) {
                primes[j] = false;
            }
        }
        return primes;
    }

   public static void sum(int n) {
        boolean[] primes = getPrimes();
        int max = 0;
        int sum = 0;
        int i = n;
        int count = 0;
        while (true) {
            i++;
            if (primes[i]) {
                if (sum + i > 1000000)
                    break;
                sum += i;
                if (primes[sum]) {
                    count++;
                } else
                    count = 0;
            }

        }
        if (count > max) {
            max = count;
        }
        if (n < 100) {
            sum(n + 1);
        }
       if (primes[sum]){
           System.out.println(sum);
       }

    }

}
