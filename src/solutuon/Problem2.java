package solutuon;

public class Problem2 {
    public static void main(String[] args) {
        long f1 = 1;
        long f2 = 1;
        int sum = 0;
        long f3 = f1 + f2;
        while (f3 <= 4000000) {
            if (f3 % 2 == 0)
                sum += f3;
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        System.out.println(sum);

    }
}
