import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bai6 {
    public static void main(String[] args) {

        System.out.println("nhap xau : ");
        String s0 = new Scanner(System.in).nextLine();
        sapxep(s0);
    }

    public static void sapxep(String s) {
        StringTokenizer s1 = new StringTokenizer(s);
        ArrayList<String> arr = new ArrayList<>();
        int n = s1.countTokens();
        int i = 0;
        while (s1.hasMoreTokens()) {
            String s2 = s1.nextToken();
            arr.add(s2);

        }
        Collections.sort(arr);
        System.out.println(arr.toString());
    }

}
