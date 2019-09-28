package solutuon;

import java.util.ArrayList;

public class Problem24 {
    static ArrayList<String> numbers = new ArrayList<>();
    public static void main(String[] args) {
        permutations("0123456789", "");
        System.out.println(numbers.get(999999));

    }

    public static void permutations(String temp, String result) {
        if (temp.length() == 0) {
            numbers.add(result);
            return;
        }

        for (int index = 0; index < temp.length(); index++) {
            char c = temp.charAt(index);
            String sub = temp.substring(0, index) + temp.substring(index + 1);
            System.out.println(sub);
            permutations(sub, result + c);
        }
    }
}
