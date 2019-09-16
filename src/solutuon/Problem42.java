package solutuon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Problem42 {
    public static void main(String[] args) throws IOException {
        File f = new File("file/problem42.txt");
        boolean[] a = new boolean[2000];
        Arrays.fill(a, false);
        int count = 0;
        for (int i = 1; i < 2000; i++) {
            int index =  i * (i + 1) / 2;
            if (index > 2000)
                break;
            a[index] = true;
        }
        String[] names = readFirstLine(f).split(",");
        for (int i = 0; i < names.length; i++) {
            if (a[letterSum(names[i])])
            count++;
        }
        System.out.println(count);

    }

    private static int letterSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sum += c - ('A' - 1);
            }
        }
        return sum;
    }

    private static String readFirstLine(File f) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            return br.readLine();
        }
    }
}
