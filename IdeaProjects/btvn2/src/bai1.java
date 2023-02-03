import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("nhap so a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("nhap so b: ");
        float b = new Scanner(System.in).nextFloat();

        System.out.printf("nghiem cua pt %.3f * x + %.3f = 0 la : %.3f ", a, b, (-b / a));
    }
}
