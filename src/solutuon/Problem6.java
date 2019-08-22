package solutuon;

public class Problem6 {
    public static void main(String[] args) {
        int first = 0;
        for (int i = 1; i <= 100 ; i++) {
            first += i * i;
        }
        int second = (1+100)*50;
        System.out.println(second * second - first);
    }
}
