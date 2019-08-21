package solutuon;

public class Problem5 {
    public static void main(String[] args) {
        long c = 20;
        boolean state = false;
        while (!state) {
            c += 20;
            for (int i = 2; i <= 20; i++) {
                if (c % i != 0)
                    break;
                else if (i == 20) {
                    state = true;
                }
            }
        }
        System.out.println(c);
    }
}
