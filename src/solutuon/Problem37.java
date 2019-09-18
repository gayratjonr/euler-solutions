package solutuon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem37 {
    public static Boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < (int)Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = (int) Math.pow(10, 6);
        int subS = 0;
        int dig = 0;
        int check = 0;
        int result = 0;
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        ArrayList<Integer> primeCheck = new ArrayList<Integer>();

        for (int i = 2; i < n + 1; i++) {
            primeCheck.add(1);
        }
        for (int i = 2; i < n; i++) {
            if (primeCheck.get(i - 2) == 1) {
                primeList.add(i);
                for (int j = 2; j < Math.floorDiv(n, i) + 1; j++) {
                    primeCheck.set(i * j - 2, 0);
                }
            }
        }
        for (int prime : primeList) {
            dig = (int)Math.log10(prime) + 1;
            check = 0;
            if (dig > 1) {
                for (int i = 1; i < dig; i++) {
                    subS = Integer.parseInt(Integer.toString(prime).substring(i));
                    if (isprime(subS) == false) {
                        check ++;
                        break;
                    }
                }
                if (check == 1) {
                    continue;
                }
                for (int j = dig; j > 0; j--) {
                    subS = Integer.parseInt(Integer.toString(prime).substring(0, j));
                    if (isprime(subS) == false) {
                        check ++;
                        break;
                    }
                }
                if (check == 0) {
                    result += prime;
                }
            }
        }
        System.out.println(result);
    }
}

