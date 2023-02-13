import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
            int n = nhapso("Nhập số lượng phần tử của mảng: ");
            int[] arr = nhapmang(n);
            xuatmang(arr);
            trungbinh(arr);

        }

        public static int[] nhapmang(int n) {
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = nhapso("a[" + i + "]: ");
            }
            return a;
        }

        public static int nhapso(String thongdiep) {
            System.out.print(thongdiep);
            return new Scanner(System.in).nextInt();
        }

        public static void xuatmang(int[] a) {
            System.out.print("[");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i != a.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        public static void trungbinh(int[] arr){
            double tong = 0;
            for(int i=0; i<arr.length; i++){
                tong = tong + arr[i];
            }
            double trungbinh = tong / arr.length;
            System.out.printf("Kết quả trung bình là: %.3f",trungbinh);
        }
    }

