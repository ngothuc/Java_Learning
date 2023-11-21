package oop_21_11_23;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        final int MIN_HEIGHT = 2;
        final int MAX_HEIGHT = 10;

        int h;
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();

        if(h >= MIN_HEIGHT && h <= MAX_HEIGHT) {
            for(int i = 1; i <= h; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }
}
