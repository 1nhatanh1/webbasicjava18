import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        System.out.println("nhập vào số m : ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("nhập vào số n : ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i<=m; i++){
            for (int j = 1 ; j<=n;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
