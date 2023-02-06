import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.println("nhập vào số n : ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + i;
        }
        System.out.printf("Tổng các số tự nhiên nhỏ hơn %d là: %d\n", n, s);
        int s1 = 0;
        for (int j = 0; j < n; j++) {
            if(j%2 !=0)
                s1=s1+j;
        }
        System.out.printf("Tổng các số tự nhiên lẻ nhỏ hơn %d là: %d\n", n, s1);
        int s2 = 0;
        for (int k = 0; k < n; k++) {
            if(k%2 ==0)
                s2=s2+k;
        }
        System.out.printf("Tổng các số tự nhiên chẵn nhỏ hơn %d là: %d\n", n, s2);

    }
}
