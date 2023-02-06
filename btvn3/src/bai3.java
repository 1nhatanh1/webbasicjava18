import java.sql.SQLOutput;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("nhập số nguyên dương a : ");
        int a = new Scanner(System.in).nextInt();
        int x = a;
        System.out.println("nhập số nguyên dương b : ");
        int b = new Scanner(System.in).nextInt();
        int y = b;
        int uscln = 0;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("USCLN là " + a);
        System.out.println("BSCNN là " + x * y / a);
    }
}
