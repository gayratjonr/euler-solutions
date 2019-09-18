package solutuon;

import java.util.HashSet;
import java.util.Set;

public class Problem32 {
    public static void main(String[] args) {
        int sum = 0;
        Set<Integer> integers = new HashSet<>();
        for (int i = 1; i <= 9999; i++) {
            for (int j = 1; j <= 9999; j++) {
                int result = i * j;
                String str = "" + i + j + result;
                if (str.length() > 9) {
                    break;
                } else if (str.length() == 9 && !str.contains("0") && isPanDigital(str)) {
                    integers.add(result);
                }
            }
        }
        for (Integer integer: integers){
            sum += integer;
        }
        System.out.println(sum);

    }

    private static boolean isPanDigital(String string) {
        boolean result = true;
        char[] arr = string.toCharArray();
        boolean[] temp = new boolean[9];
        for (int i = 0; i < arr.length; i++) {
            int val = Character.getNumericValue(arr[i]);
            if (temp[val - 1]) {
                result = false;
                break;
            } else {
                temp[val - 1] = true;
            }
        }
        return result;
    }
}
