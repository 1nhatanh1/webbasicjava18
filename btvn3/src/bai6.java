import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("nhập vào số N : ");
        int n = new Scanner(System.in).nextInt();
        int s = 0;
        while(n!=0){
            s = s+n%10;
            n = n/10;
        }
        System.out.println(s);
    }
}
