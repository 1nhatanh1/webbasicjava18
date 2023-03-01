public class bai1 {
    public static void main(String[] args) {
        ktra();
    }

    private static void ktra() {
        int count = 0 ;
        for (int i = 100000; i <1000000 ; i++) {
            String n ="";
            n+= i;
            if(thuanNghich(n)){
                System.out.printf("%10d",i);
                if(count++%10==0)
                    System.out.println("");
            }
            
        }
    }

    static boolean thuanNghich(String n){
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)!=n.charAt(n.length()-i-1)) return false;
            
        }
        return true;
    }

}
