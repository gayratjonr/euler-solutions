package solutuon;

public class Problem9 {
    public static void main(String[] args) {
        boolean check = false;
        for (int i = 1; i < 1000; i++) {
            if (check){
                break;
            }
            for (int j = 1; j < 1000; j++) {
                int c = 1000 - (j+i);
                if (c * c == (i * i + j * j)){
                    System.out.println(i * j * c);
                    System.out.println(i + " " +  j + " "+c);
                    check = true;
                    break;
                }
            }
        }
    }
}
