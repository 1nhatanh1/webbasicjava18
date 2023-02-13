import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran");
        m = nhap.nextInt();
        System.out.println("Nhap so cot cua ma tran");
        n = nhap.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[n][m];
        nhapmatran(a, m, n);
        mtchuyenvi(a, b, m, n);
        xuatmatran(b, m, n);
    }

    public static void nhapmatran(int[][] a, int m, int n) {
        int hang, cot;
        Scanner nhap = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hang = i + 1;
                cot = j + 1;
                System.out.println("Nhap phan tu hang " + hang + " cot " + cot + " cua ma tran");
                a[i][j] = nhap.nextInt();
            }
        }
    }

    public static void mtchuyenvi(int[][] a, int[][] b, int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = a[j][i];
            }
        }
    }

    public static void xuatmatran(int[][] b, int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1)
                    System.out.print(b[i][j] + "\n");
                else
                    System.out.print(b[i][j] + "  ");
            }
        }
    }

    public static int nhapso(String thongdiep) {
        System.out.print(thongdiep);
        return new Scanner(System.in).nextInt();
    }

}
