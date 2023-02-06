import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("nhập số a : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhập số b : ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("nhập số c : ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("nhập số d : ");
        int d = new Scanner(System.in).nextInt();
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.printf("Số lớn nhất trong các số %d %d %d %d là : %d", a, b, c, d, max);

    }
}
