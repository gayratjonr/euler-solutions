package solutuon;

public class Problem7 {
    public static void main(String[] args) {
        int largeNumber = 10000000;
        boolean a[] = new boolean[largeNumber];
        int count = 0;
        for (int i = 0; i < largeNumber ; i++) {
            a[i] = false;
        }

        for (int i = 2; i < largeNumber ; i++) {
            for (int j = i + i; j < largeNumber; j = j + i) {
                a[j] = true;
            }
        }
        for (int i = 2; i < largeNumber; i++) {
            if (!a[i])
                count++;
            if (count == 10001){
                System.out.println(i);
                break;
            }
        }

    }
}
