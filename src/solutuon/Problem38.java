package solutuon;

public class Problem38 {
    public static void main(String[] args) {
        String result = "";
        for (long i = 9387; i >= 9234; i--) {
            result = "" + i + 2*i;
            if(isPandiget(result)){
                break;
            }
        }
        System.out.println(result);

    }

    private static boolean isPandiget(String number) {
        boolean[] a = new boolean[9];
        boolean flag = true;
        for (int i = 0; i < number.length(); i++) {
            int value = Character.getNumericValue(number.charAt(i));
            if (value == 0 || a[value - 1]) {
                flag = false;
                break;
            } else {
                a[value - 1] = true;
            }
        }
        return flag;
    }
}
