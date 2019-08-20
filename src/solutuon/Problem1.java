package solutuon;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum  = 0;
        for (int i = 3; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
