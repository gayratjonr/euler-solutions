package solutuon;

public class Problem17 {
    public static void main(String[] args) {
        int sum = 11;

        for (int i = 1; i < 1000; i++) {
            sum += lettersInNum(i);
        }
        System.out.println(sum);
    }

    private static int lettersInNum(int number) {
        int sum = 0;
        int[] digits = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8};
        int[] tens = {0, 6, 6, 5, 5, 5, 7, 6, 6};
        int[] hundreds = {0, 10, 10, 12, 11, 11, 10, 12, 12, 11};
        int tensAndOnes = number % 100;
        int hundred = number / 100;
        sum += hundreds[hundred];
        if (tensAndOnes > 19) {
            int digit = tensAndOnes % 10;
            int ten = tensAndOnes / 10;
            sum += digits[digit];
            sum += tens[ten-1];
        } else {
            sum += digits[tensAndOnes];
        }
        if (hundred > 0 && tensAndOnes > 0){
            sum +=3;
        }
        return sum;
    }
}
