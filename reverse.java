public class reverse {
    public static void main(String[] args) {
        int a = 121;
        int temp=a;
        int rev = 0;
        while (a > 0) {
            int ld = a % 10;
            rev = (rev * 10) + ld;
            a = a / 10;
        }
        if (temp==rev) {
            System.out.println("palindrome");

        }
        else {
            System.out.println("not palindrome");
        }
    }
}