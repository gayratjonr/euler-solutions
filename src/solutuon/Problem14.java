package solutuon;

public class Problem14 {
    public static void main(String[] args) {
        long maxCount  = 0;
        long maxNumber = 0;
        long n;
        for (int i = 2; i <= 1000000; i++) {
            int count = 1;
              n = i;
            while (n > 1){
                if ((n % 2) == 0){
                    n = n/2;
                } else {
                    n =  n * 3 +1;
                }
                count++;
            }
            if (count > maxCount){
                maxCount = count  ;
                maxNumber = i;
            }
        }
        System.out.println(maxNumber);
    }
}
