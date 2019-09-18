package solutuon;

public class Problem28 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 3; i <= 1001; i = i + 2) {
            sum = sum + i * i;
            sum = sum + i * i - (i - 1);
            sum = sum + i * i - (i * 2 - 2);
            sum = sum + i * i - (i * 3 - 3);
        }
        System.out.println(sum);
    }
}
