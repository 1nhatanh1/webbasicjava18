import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int num = 3;
        int status = 0;
        System.out.println("nhập vào n số nguyên tố đầu tiên : ");
        int n = new Scanner(System.in).nextInt();
        if (n >= 1) {
            System.out.println(n + " Số nguyên tố đầu tiên là:");
            System.out.println(2);
            for (int i = 2; i <= n; ) {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0)
                    {
                        status = 0;
                        break;
                    }
                }
                if (status != 0) {
                    System.out.println(num);
                    i++;
                }
                status = 1;
                num++;
            }
        }
    }
}



