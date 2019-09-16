package solutuon;

public class Problem21 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 10000; i++) {
            int firstNumber = sumOfDivisor(i);
            int secondNumber = sumOfDivisor(firstNumber);
            if (secondNumber == i && i < firstNumber) {
                sum += firstNumber + i;
            }
        }
        System.out.println(sum);
    }

    private static int sumOfDivisor(int number) {
        int sum = 0;
        int sqrtNUmber = (int) Math.sqrt(number);
        for (int j = 1; j <= sqrtNUmber; j++) {
            if (number % j == 0) {
                sum += (j + number / j);
            }
            if (sqrtNUmber * sqrtNUmber == number) {
                sum -= sqrtNUmber;
            }
        }
        return sum - number;
    }
}
