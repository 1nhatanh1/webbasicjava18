import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        System.out.println("nhập vào số m : ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("nhập vào số n : ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == m || j == 1 || j == n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }
}

