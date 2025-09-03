public class rev_string {
    public static void main(String[] args) {
        String s = "radar";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            System.err.println("palindrome");
        } else {
            System.err.println("not palindrome");
        }
        System.err.println(rev);
    }
}