package solutuon;

public class Problem44 {
    public static void main(String[] args) {
        int i = 1;
        boolean found = true;
        while (found) {
            i++;
            int n = i * (3 * i - 1) / 2;
            for (int j = i - 1; j > 0; j--) {
                int m = j * (3 * j - 1) / 2;
                if (isPentagonal(n - m) && isPentagonal(m + n)) {
                    System.out.println(n - m);
                    found = false;
                    break;
                }
            }
        }
    }

    private static boolean isPentagonal(long number) {
        double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
        return penTest == ((int) penTest);
    }
}
