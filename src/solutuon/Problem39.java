package solutuon;

import java.util.ArrayList;
import java.util.List;

public class Problem39 {
    public static void main(String[] args) {
        int maxP = 0;
        int max = 0;
        List<Integer> masSize = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                for (int k = 1 ; k <= 1000; k++) {
                    if (k * k == i * i + j * j && k + j + i <= 1000) {
                        int p = k + j + i;
                        masSize.add(p);
                    }
                }
            }
        }
        for (int i = 0; i < masSize.size() ; i++) {
            int count = 0;
            for (int j = 0; j < masSize.size(); j++) {
                if (masSize.get(i).equals(masSize.get(j)))
                    count++;
            }
            if (count > max ){
                max = count;
                maxP = masSize.get(i);
            }
        }
        System.out.println(maxP);
        System.out.println(max);
    }
}
