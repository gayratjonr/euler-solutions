package solutuon;

public class Problem15 {

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        long[][] paths = new long[rows + 1][cols + 1];
        for (int c = 0; c <= cols; c++) paths[0][c] = 1;
        for (int r = 0; r <= rows; r++) paths[r][0] = 1;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) paths[r][c] = paths[r - 1][c] + paths[r][c - 1];
        }
        System.out.println(paths[rows][cols]);
    }
}

