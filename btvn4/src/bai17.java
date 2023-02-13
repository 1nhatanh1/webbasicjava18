import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        System.out.println("nhập vào số n : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các số chẵn nhỏ hơn n : "+sochan(n));
        System.out.println("Các số le nhỏ hơn n : "+sole(n));
    }

    public static int sochan(int n) {

        for (int i = 0; i < n; i += 2) {
            System.out.printf("%d, ", i);
        }
        return n;
    }

    public static int sole(int n) {
        System.out.println("\nCác số lẻ nhỏ hơn n : ");
        for (int j = 1; j < n; j += 2) {
            System.out.printf("%d, ", j);
        }
        return n;
    }
}

