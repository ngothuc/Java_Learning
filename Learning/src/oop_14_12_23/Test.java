package oop_14_12_23;

import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        String name; int year;
        int total = 0;

        System.out.print("Số phần tử cho mảng student: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Student[] student = new Student[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i+1));
            scanner.nextLine();
            System.out.print("Tên: "); name = scanner.nextLine();
            System.out.print("Năm sinh: "); year = scanner.nextInt();
            student[i] = new Student(name, year);
        }
        scanner.close();

        for(Student std : student) {
            System.out.println("Tên: " + std.getName());
            total += Calendar.getInstance().get(Calendar.YEAR) - std.getYear();
        }
        System.out.println("Tổng số tuổi: " + total);
    }
}
