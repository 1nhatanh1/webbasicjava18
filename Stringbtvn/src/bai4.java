import java.util.Scanner;
import java.util.StringTokenizer;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 chuoi: ");
        String s = new Scanner(System.in).nextLine();
        timChuoiMax(s);
    }

    public static void timChuoiMax(String strInput) {
        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
        int max, i = 1, lengthStr;
        max = strToken.nextToken().length();
        int viTriMax = i;
        while (strToken.hasMoreTokens()) {
            lengthStr = strToken.nextToken().length();
            i++;
            if (max < lengthStr) {
                max = lengthStr;
                viTriMax = i;
            }
        }
        System.out.println("Do dai chuoi lon nhat la: " + max + " o vi tri " + viTriMax);
    }
}
