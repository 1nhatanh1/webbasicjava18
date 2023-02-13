import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        System.out.print("nhap so luong phan tu mang : ");
        int n = new Scanner(System.in).nextInt();
        float[] arr = nhapmang(n);
        xuatmang(arr);
        System.out.println("---------------");
        sapxep(arr);
        xuatmang(arr);
        System.out.println("---------------");


    }


    public static float[] nhapmang(int n) {
        float[] a = new float[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = new Scanner(System.in).nextFloat();
        }
        return a;
    }


    public static void xuatmang(float[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void sapxep(float[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
    }
}