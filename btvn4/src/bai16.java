import java.util.Scanner;

public class bai16 {

    public static void main(String[] args) {
        System.out.println("nhập vào số n : ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf(" tổng các số tự nhiên không lớn hơn %d và chia hết cho 7 là : %d", n, tong(n));
    }
    public static int tong(int n){
        int s = 0;
        for (int i = 7; i < n; i += 7) {
            s = s + i;
        }
        return s;
    }

}
