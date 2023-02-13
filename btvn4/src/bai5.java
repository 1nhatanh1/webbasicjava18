import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
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
        int max = a[0];
        int second = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(max < a[i]){
                max=a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(a[i] != max && a[i]>second) {
                second = a[i];

            }
        }
        System.out.println(second);
    }
}
