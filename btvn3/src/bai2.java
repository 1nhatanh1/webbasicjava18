import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập số N : ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("các ước số của %d là : \n", n);
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0)
                System.out.printf("%d ", i);

        }
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0)

            dem++;
        }
        System.out.println("có " + dem + " ước");
    }
}
