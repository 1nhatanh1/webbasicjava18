import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        System.out.println("nhập vào số tự nhiên n : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("tong day so la : "+tong(n));
    }

    public static double tong(double n) {
        double tong = 0;
        for (int i = 1; i < n; i++) {
            tong += (double)1 / i;
        }
        return tong;
    }
}
