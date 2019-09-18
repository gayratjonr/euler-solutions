package solutuon;

public class Problem34 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = factarial(i);
        }
        for (int i = 10; i < 10000000; i++) {
            int number = i;
            int sumDigts = 0;
            while (number > 0) {
                int d = number % 10;
                number = number / 10;
                sumDigts += a[d];

            }
            if (sumDigts == i){
                sum +=sumDigts;
            }
        }
        System.out.println(sum);

    }


    private static int factarial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
