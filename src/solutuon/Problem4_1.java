package solutuon;

public class Problem4_1 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int isPalindrome = 0;
        for (int i = 100; i <=999; i++) {
            for (int j = 100; j <=999 ; j++) {
                if (isPalindrome( i*j +"")){
                    if (i * j > isPalindrome)
                        isPalindrome = i *j;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        System.out.println(isPalindrome);

    }

    private static boolean isPalindrome(String number){
        for (int i = 0; i < number.length()/2; i++)
            if (number.charAt(i) != number.charAt(number.length() -1 -i))
                return false;
            return true;
    }
}
