import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=sc.nextLine();
        String rev="";
        for (int i=s.length()-1;i>=0;i--) {
            char c=s.charAt(i);
            rev+=Character.toString(c);
        } 
        if (rev.equals(s)) {
            System.out.println("string is palindromre");
        } else {
            System.out.println("string is not palindrome");
        }
    }
}