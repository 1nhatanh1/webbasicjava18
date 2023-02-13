import java.util.Arrays;
import java.util.Scanner;

public class bai7 {
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
        for(int i = 0; i < n/2; i++)
        {
            if(a[i] != a[n - i - 1])
            {
                System.out.println("mảng không đối xứng");
                break;
            }
            System.out.println("mảng đối xứng");
            break;
        }

    }
}
