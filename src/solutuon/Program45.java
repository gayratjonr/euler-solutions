package solutuon;

public class Program45 {
    public static void main(String[] args) {
        long result = 0;
        int i = 143;
        while (true) {
            i++;
            result = i * (2 * i - 1);

            if (isPentagonal(result)) {
                break;
            }
        }
        System.out.println(result);
    }

    private static boolean isPentagonal(long number) {
        double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
        return penTest == ((int)penTest);
    }
}
