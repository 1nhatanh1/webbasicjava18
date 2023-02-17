package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyPoint[] p = new MyPoint[100];
        int n, h = 0, k = 0;
        double x, y, max = 0;
        System.out.print("nhap so diem: ");
        n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            p[i] = new MyPoint();
            System.out.println("diem " + i + ": ");
            System.out.print("x= ");
            x = new Scanner(System.in).nextDouble();
            p[i].setX(x);
            System.out.print("y= ");
            y = new Scanner(System.in).nextDouble();
            p[i].setY(y);
        }


        for (int i = 1; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (p[i].distance(p[j]) > max) {
                    max = p[i].distance(p[j]);
                    h = i;
                    k = j;
                }
        System.out.println("khoang cach max la: " + max + " giua 2 diem: " + h + " " + k);
    }

}
