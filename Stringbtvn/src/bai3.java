import java.util.Scanner;
import java.util.StringTokenizer;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("nhap vao 1 chuoi");
        String s = new Scanner(System.in).nextLine();
        System.out.println(boCach(s));
    }

    public static String chuyenInHoa(String str) {
        String s, sOutput;
        s = str.substring(0, 1);
        sOutput = str.replaceFirst(s, s.toUpperCase());
        return (sOutput);
    }

    public static String boCach(String sInput) {
        String sOutput = "";
        StringTokenizer strToken = new StringTokenizer(sInput, " ,\t,\r");
        sOutput += "" + chuyenInHoa(strToken.nextToken());
        while (strToken.hasMoreTokens()) {
            sOutput += " " + chuyenInHoa(strToken.nextToken());
        }
        return (sOutput);
    }
}

