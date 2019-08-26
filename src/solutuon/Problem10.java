package solutuon;

import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        boolean[] a = new boolean[2000000];
        for (int i = 2; i < a.length; i++) {
            a[i] = false;
        }

        for (int i = 2; i < a.length; i++) {
            for (int j = i + i; j < a.length; j += i) {
                a[j] =  true;
            }
        }
        long sum = 0;
        for (int i = 2; i < a.length; i++) {
            if (!a[i])
            sum += i;
        }
        System.out.println(sum);

    }
}
