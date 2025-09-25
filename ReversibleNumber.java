public class ReversibleNumber {
    public static void main(String[] args) {
        int num = 36;
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int ld = num % 10;
            rev = (rev * 10) + ld;
            num = num / 10;
        }
        int sum = temp + rev;
        int count = 0;
        int length = String.valueOf(sum).length();
        while (sum > 0) {
            int ld = sum % 10;
            if (ld % 2 != 0) {
                count++;
            }
            sum = sum / 10;
        }
        if (count == length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
