public class bai1 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 1000000000; i++) {
            if (kiemtrasothuannghich(i) && kiemtraso068(i) && tongchusochiahet10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean kiemtrasothuannghich(int n) {
        int temp = n;
        int sodao = 0;
        while (temp > 0) {
            sodao = sodao * 10 + temp % 10;
            temp /= 10;
        }
        return n == sodao;
    }

    public static boolean kiemtraso068(int n) {
        while (n > 0) {
            int t = n % 10;
            if (t != 0 && t != 6 && t != 8)
                return false;
            n = n / 10;
        }
        return true;
    }

    public static boolean tongchusochiahet10(int n) {
        int s = 0;
        while ( n> 0){
            int t = n%10;
            n = n/10;
            s+=t;
        }
        while (s % 10 !=0) {
            return false;
        }
        return true;
    }
}
