public class bai2 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000; i++) {
            if (songuyento(i) && chusosnt(i) && daolasnt(i))
                System.out.println(i);
        }
    }

    public static boolean songuyento(int n) {
        int canbachai = (int) Math.sqrt(n);
        if (n > 1) {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        } else return false;
    }

    public static boolean chusosnt(int n) {
        while (n != 0) {
            if (!songuyento(n % 10)) return false;
            n /= 10;
        }
        return true;
    }

    public static boolean daolasnt(int n) {
        int dao = 0;
        while (n != 0) {
            int temp = n % 10;
            dao = dao * 10 + temp;
            n /= 10;
        }
        int canbachai = (int) Math.sqrt(n);
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

}
