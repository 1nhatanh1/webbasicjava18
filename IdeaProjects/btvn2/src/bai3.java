import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Chiều dài hình chữ nhật : ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Chiều rộng hình chữ nhật : ");
        float b = new Scanner(System.in).nextFloat();

        System.out.printf("Chu vi HCN với chiều dài %.3f và chiều rộng %.3f là: %.3f\n", a, b,(a + b)*2);

        System.out.printf("Diện tích HCN với chiều dài %.3f và chiều rộng %.3f là: %.3f", a, b,a * b);

    }
}
