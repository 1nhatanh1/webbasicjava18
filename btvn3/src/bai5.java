import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int nghich = 0;
        int m = n;
        while (m>0) {
            nghich = nghich *10 + m%10;
            m/=10;
        }
        if ( nghich== n){
            System.out.printf("%d là số thuận nghịch",n);
        }else{
            System.out.printf("%d là số không thuận nghịch",n);
        }
    }
}
