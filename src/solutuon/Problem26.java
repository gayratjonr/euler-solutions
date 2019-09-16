package solutuon;

import java.util.ArrayList;
import java.util.List;
public class Problem26 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int dmax = 0;
        int max = 0;
        for (int d = 1; d < 1000; d++) {
            List<Integer> recurrence = new ArrayList<>();
            int div = 10;
            boolean gate = true;
            while (div % d != 0){
                while (d > div){
                    div *= 10;
                }
                if (recurrence.contains(div)){
                    break;
                }
                recurrence.add(div);
                div %= d;
            }
            if (div % d == 0){
                gate = false;
            }
            if (recurrence.size() > max && gate){
                max = recurrence.size();
                dmax = d;
            }
        }
        System.out.println(dmax);
        System.out.printf("Took me %d ms %n", System.currentTimeMillis() - start);
    }
}
