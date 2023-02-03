import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) throws ParseException {
        System.out.println("nhap ngay thang nam sinh:   (dd/MM/yyyy)");
        String birthday = new Scanner(System.in).nextLine();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaysinh = simpleDateformat.parse(birthday);
        Date today = new Date();

        System.out.println(today.getYear()-ngaysinh.getYear());
    }
}
