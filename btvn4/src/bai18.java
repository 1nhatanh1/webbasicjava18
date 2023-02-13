import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        System.out.println("nhập vào số m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("nhập vào số n : ");
        int n = new Scanner(System.in).nextInt();
        if (sntcungnhau(m, n) == false) {
            System.out.println("so nguyen to cung nhau");
        } else {
            System.out.println("khong phai snt cung nhau");
        }
    }

    public static boolean sntcungnhau(int m, int n) {
        int min = Math.min(m, n);
        int ucln = 1;
        for (int i = 1; i <= min; i++)
            if (m % i == 0 && n % i == 0 && i > ucln) {
                ucln = 1;
            }
        if (ucln == 1) {
            return true;
        } else {
            return false;
        }
    }
}
