import java.util.HashSet;
import java.util.Scanner;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=sc.nextLine();
        int maxlen=0;
        String substring="";
        HashSet<Character> set=new HashSet<>();

        for (int i=0;i<s.length();i++) {
            String temp="";
            for (int j=0;j<s.length();j++) {
                char c=s.charAt(j);
                if (!set.contains(c)) {
                    set.add(c);
                    temp+=c;
                } else {
                    break;
                }
            }
            if (temp.length()>maxlen) {
                maxlen=temp.length();
                substring=temp;
            }
        }
        System.out.println("maximum length of substring is: "+maxlen);
        System.out.println("the longest substring is: "+substring);
    }
}