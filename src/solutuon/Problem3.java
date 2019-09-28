package solutuon;

public class Problem3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        int i = 0;
        long begin = System.currentTimeMillis();
        System.out.print("Prime factorization result is : ");
        for (long primeFactor = 2L; primeFactor <= number; primeFactor++) {
            while (number % primeFactor == 0) {
                number /= primeFactor;
                i++;
            }
            if (i > 0)
                System.out.print(" " + primeFactor);
            i = 0;
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(end - begin);
    }
}
