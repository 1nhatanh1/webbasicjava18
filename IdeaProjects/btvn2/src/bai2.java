import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhập b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.println("Nhập c: ");
        float c = new Scanner(System.in).nextFloat();
        double delta = Math.sqrt(b * b - 4 * a * c);
        System.out.printf("Nghiệm của phương trình %.3f * x * x +  %.3f * x + %.3f = 0 là : %.3f và %.3f",a ,b ,c , (-b + delta)/2*a, (-b - delta)/2*a );
    }
}
