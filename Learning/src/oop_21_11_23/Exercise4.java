package oop_21_11_23;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        final int MAX_SIZE = 8;
        final int MIN_SIZE = 3;

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n < MIN_SIZE || n > MAX_SIZE) {
            System.out.println("Size of matrix must be greater or equal to " + MIN_SIZE + " and must be less than or equal to " + MAX_SIZE + ".");
            return;
        }

        Matrix matrix = new Matrix(n);

        int row = 0;
        int col = 0;
        int num = 1;

        int [] x = {1, 0, -1, 0};
        int [] y = {0, 1, 0, -1};

        int active_index = 0;

        while(num <= n * n) {
            matrix.elements[row][col] = num++;
            if(matrix.checkMatrix(row + y[active_index], col + x[active_index], n))
            {
                row = row + y[active_index];
                col = col + x[active_index];
            }else {
                active_index = (active_index + 1) % 4;
                row = row + y[active_index];
                col = col + x[active_index];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix.elements[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
