package solutuon;

import java.util.Arrays;

public class Problem46 {
    public static void main(String[] args) {
        int[] primes = getPrimeList();
        boolean notFound = true;
        int result = 7;
        while(notFound){
            result += 2;
            int j = 0;
            notFound = false;
            while (result >= primes[j]) {
                if(isSqrt((result-primes[j])/2)){
                    notFound = true;
                    break;
                }
                j++;
            }
        }
        System.out.println(result);

    }

    private static boolean isSqrt(int number) {
        double numberSqrt = Math.sqrt(number);
        return numberSqrt == ((int) numberSqrt);
    }

    private static int[] getPrimeList(){
        boolean[] primes = new boolean[1000000];
        int[] a = new  int[1000];
        Arrays.fill(primes, true);
        for (int i = 2; i < 1000000; i++) {
            for (int j = i + i; j < 1000000; j = j + i) {
                primes[j] = false;
            }
        }
        int j = 0;
        for (int i = 7; i < 1000000; i++) {
            if (primes[i]){
                a[j] = i;
                j++;
            }
            if (j > 999){
                i = 1000000;
            }
        }
        return a;
    }
}
