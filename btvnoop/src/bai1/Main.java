package bai1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhập số lượng sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Nhập mã sinh viên : ");
            students[i].ID = new Scanner(System.in).nextInt();
            System.out.println("Nhập tên sinh viên : ");
            students[i].name = new Scanner(System.in).nextLine();
            System.out.println("Nhập lớp sinh viên : ");
            students[i].classroom = new Scanner(System.in).nextLine();
            System.out.println("Nhập khóa sinh viên : ");
            students[i].course = new Scanner(System.in).nextLine();
        }
        System.out.println(Arrays.toString(students));

    }
}
