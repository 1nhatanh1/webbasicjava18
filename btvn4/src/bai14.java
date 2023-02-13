import java.util.Scanner;

public class bai14 {

    public static void main(String[] args) {
        System.out.println("nhập vào số tự nhiên m : ( m < n )");
        int m = new Scanner(System.in).nextInt();
        System.out.println("nhập vào số tự nhiên n : (m < n ) ");
        int n = new Scanner(System.in).nextInt();
        int dem = 0;
        for (int i = m; i <= n; i++) {
            int j = (int) Math.sqrt(i);
            if (i == j * j) {
                System.out.println(i);
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Không có số chính phương trong dãy");
        } else {
            System.out.printf("có %d số chính phương\n", dem);
        }
    }
}

