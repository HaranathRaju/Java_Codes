public class Palindrome_String {
    public static void main(String[] args) {
        String s="radar";
        String rev="";
        for (int i=s.length()-1;i>=0;i--) {
            rev+=s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("it is a palindrome string");

        }
        else {
            System.out.println("it is not a palindrome string");
        }
        
    }
}