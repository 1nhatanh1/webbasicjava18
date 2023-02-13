import java.util.Scanner;

public class bai25 {

    public static void main(String[] args) {
        int n = nhapso("Nhập số lượng phần tử của mảng: ");
        int[] arr = nhapmang(n);
        xuatmang(arr);
        sochansole(arr);
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
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public static void sochansole(int[] arr) {

        int demchan = 0;
        int demle = 0;
        for (int i = 0; i < arr.length; i++) {
            int scsl = arr[0];
            if(scsl %2 ==0){
                demchan++;

            }if(scsl %2 !=0){
                demle++;
            }
        }
        System.out.println("tong so chan " + demchan);
        System.out.println("tong so le " + demle);
    }

}

