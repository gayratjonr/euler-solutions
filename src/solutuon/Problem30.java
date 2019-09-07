package solutuon;

public class Problem30 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 355000 ; i++) {
            if (i == sumFifthPowers(i)){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    private static int sumFifthPowers(int number) {
        int sum = 0;
        while (number > 0) {
            int mod = number % 10;
            number = number / 10;
            sum += mod * mod * mod * mod * mod;
        }
        return sum;
    }
}
