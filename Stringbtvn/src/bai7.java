import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        System.out.println("nhap xau s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.println("nhap xau s2: ");
        String s2 = new Scanner(System.in).nextLine();
        int n = s2.length();
        String s = new String();
        String kt = new String();
        System.out.println("cac vi tri cua s2 trong s1 la: ");
        for (int i = 0; i < s1.length() - n + 1; i++) {
            kt = s1.substring(i, i + n);
            if (kt.equals(s2)) System.out.print(i + "   ");

        }

        s1 = s1.replaceAll(s2, s);

        System.out.println("\n xau s1 sau khi xoa tat ca cac xau s2 la: ");
        System.out.println(s1);


    }
}
