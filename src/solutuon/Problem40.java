package solutuon;

public class Problem40 {
    public static void main(String[] args) {
        String irotsanalNumber = "";
        long result = 1;
        for (int i = 1; i <= 200000; i++) {
            irotsanalNumber += i;

        }

        for (int i = 1; i <= 1000000; i *= 10) {
            result *= Integer.parseInt("" + irotsanalNumber.charAt(i - 1));
        }

        System.out.println(irotsanalNumber.length());
        System.out.println(result);

    }
}
