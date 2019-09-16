package solutuon;

import java.io.*;
import java.util.*;

public class Problem22 {
    public static void main(String[] args) throws IOException {
        File f = new File("file/name.txt");
        long time = System.nanoTime();

        String[] names = readFirstLine(f).split(",");
        Arrays.sort(names);

        int total = 0;
        for (int i = 0; i < names.length; i++) {
            total += (i + 1) * letterSum(names[i]);
        }
        System.out.println(total);
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
