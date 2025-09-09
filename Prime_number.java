public class Prime_number {
    public static void main(String[] args) {
        int num = 23;
        boolean isprime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }

    }
}