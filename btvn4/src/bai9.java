import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn Random bao nhiêu số: ");
        n = scanner.nextInt();
        int counter;
        Random so = new Random();
        System.out.println("Các số Random là:");
        for (counter = 1; counter <= n; counter++) {
            System.out.println(so.nextInt(1000));
        }
    }
}
