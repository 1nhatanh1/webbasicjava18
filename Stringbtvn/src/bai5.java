import java.util.Scanner;
import java.util.StringTokenizer;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 chuoi: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println(doiViTri(s));


    }
    public static String doiViTri(String strInput){
        StringTokenizer strToken= new StringTokenizer(strInput," ");
        String ho    = strToken.nextToken();
        String hoDem = strToken.nextToken();
        String ten   = strToken.nextToken();
        String strOutput= ten+" "+ho+" "+hoDem;
        return(strOutput);
    }
}
