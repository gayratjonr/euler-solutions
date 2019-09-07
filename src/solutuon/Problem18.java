package solutuon;


import java.util.ArrayList;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        String numberString = String.valueOf(326);
        String numberTemp = numberString;
        do {
            numberTemp = numberTemp.substring(1) + numberTemp.charAt(0);
            System.out.println(numberTemp);
        } while (!numberString.equals(numberTemp));
    }
}
