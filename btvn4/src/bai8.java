import java.util.Arrays;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1));
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(a));
        int max = 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++)
                if (a[i] == a[j]) b[i]++;
        }
        max = b[0];
        for (int i = 1; i < a.length; i++)
            if (b[i] > max) max = b[i];
        for (int i = 0; i < a.length; i++)
            if (b[i] == max) {
                System.out.println("phần tử " + a[i] + " xuất hiện nhiều nhất");
            }

    }

}


