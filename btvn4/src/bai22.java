import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        System.out.print("nhap so luong phan tu mang : ");
        int n = new Scanner(System.in).nextInt();
        float[] arr = nhapmang(n);
        xuatmang(arr);
        System.out.println("---------------");
        sapxep(arr);
        xuatmang(arr);
        System.out.println("---------------");
        System.out.println("nhap so x can chen : ");
        float x = new Scanner(System.in).nextFloat();
        float[] kq = chenso(arr, x);
        xuatmang(kq);

    }

    private static float[] chenso(float[] arr, float x) {
        float[] result = new float[arr.length + 1];
        int marker = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                marker = i;
                result[i] = x;
                break;
            }
            result[i] = arr[i];
        }
        for (int i = marker +1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
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
                if (a[i] > a[j]) {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
    }

}
