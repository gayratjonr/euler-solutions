package solutuon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem24 {
    public static void main(String[] args) {
        int sum = 0;
        List<Integer> primes = getPrimeList();
        for (int i = 999999999; i > 899999999; i--) {
            if (isPadigit("" +i)){

            }
        }
    }

    private static boolean isPadigit(String number) {
        for (int i = 0; i <= number.length(); i++) {
            if (!number.contains("" + i)) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> getPrimeList() {
        List<Integer> primeList = new ArrayList<>();
        boolean[] a = new boolean[100];
        Arrays.fill(a, true);
        for (int i = 2; i < 100; i++) {
            for (int j = i + i; j < 100; j += i) {
                a[j] = false;
            }
        }
        for (int i = 0; i <100 ; i++) {
            if (a[i]){
                primeList.add(i);
            }
        }
        return primeList;
    }
}
