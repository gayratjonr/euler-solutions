package solutuon;

public class Problem36 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindromeString(i) && isPalindromeNumber(i)){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPalindromeNumber(int number){
        int newNumber = 0;
        int temp = number;
        while (number > 0){
            int mod = number % 10;
            number = number / 10;
            newNumber = newNumber * 10 + mod;
        }
        return newNumber == temp;
    }

    private static String convertBaseTwo(int number){
        String baseTwo = "";
        while (number > 0){
            int mod = number % 2;
            number = number/2;
            if (mod != 0){
                baseTwo +="1";
            } else {
                baseTwo +="0";
            }
        }
        return baseTwo;
    }

    private static  boolean isPalindromeString(int number){
        String numberStr = convertBaseTwo(number);
        return numberStr.equals(new StringBuilder(numberStr).reverse().toString());
    }
}
