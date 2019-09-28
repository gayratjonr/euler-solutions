package solutuon;

public class Problem47 {
    public static void main(String[] args) {
        int distinct = 4;
        int maxFactor = 250000;
        int[] primeFactors = new int[maxFactor + 1];

        for (int i = 2; i <= maxFactor; i++) {
            if (primeFactors[i] == 0) {
                for (int j = i; j <= maxFactor; j += i) {
                    primeFactors[j] += 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 2; i < maxFactor; i++) {
            if (primeFactors[i] == distinct) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt == distinct) {
                System.out.println(i - distinct + 1);
                break;
            }
        }
    }
}
