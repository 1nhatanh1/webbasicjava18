import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("nhập vào 1 chuỗi : ");
        String a = new Scanner(System.in).nextLine();
        System.out.println("nhập chữ cần tìm: ");
        String b = new Scanner(System.in).nextLine();
        System.out.println("vi tri  chu can tim xuat hien trong chuoi la : "+ a.indexOf(b));
        System.out.println("vi tri  cuoi chu can tim xuat hien trong chuoi la : "+ a.lastIndexOf(b));


        System.out.println("---------------------------");
        System.out.println("nhập vào 1 chuỗi : ");
        String s = new Scanner(System.in).nextLine();
        System.out.println("từ cần thay đổi : ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.println("thay đổi thành : ");
        String s2 = new Scanner(System.in).nextLine();
        System.out.println("Chuỗi mới là : "+ s.replace(s1, s2));
    }
}
