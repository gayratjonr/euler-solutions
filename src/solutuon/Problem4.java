package solutuon;

public class Problem4 {
    public static void main(String[] args) {

        int max  = 0;
        for (int i = 100; i < 999 ; i++) {
            for (int j = 100; j < 999; j++) {
                if (isPalindrome(i * j)){
                    if (i * j  > max){
                        max = i * j;
                    }
                }
            }
        }
        System.out.println(max);

    }

    private static boolean isPalindrome(int number){
        int x = number;
        int reverse = 0;
        int digit = 0;

        while (x > 0){
            digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x/10;

        }
        return reverse == number;

    }
}
