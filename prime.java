public class prime {
    public static void main(String[] args) {
        int a=13;
        int i;
        for (i=2;i<a;i++) {
            if (a%i==0)  {
                System.out.println("not prime") ;
                break;
            } 
        }
        if (i==a) {
            System.out.println("prime");
        }
    }
}