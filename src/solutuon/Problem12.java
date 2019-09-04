package solutuon;

public class Problem12 {
        public static void main(String[] args) {
            long triangleNumber=0;
            for (int i=1; i>0; i++) {
                triangleNumber += i;
                int count = 0;
                for (long j = 1; j <= Math.ceil(Math.sqrt(triangleNumber)); j++) {
                    if (triangleNumber % j == 0) {
                        count = count + 2;
                    }
                    if (j * j == triangleNumber) {
                        count = count - 1;
                    }
                }
                if (count > 500) {
                    System.exit(0);
                }
            }
            System.out.println(triangleNumber);

    }
}
