import java.util.*;
import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String str=sc.nextLine();

        Map<Character,Integer>m=new HashMap<>();
        for(int i=0;i<str.length();i++){
            m.put(str.charAt(i),m.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry: m.entrySet()) {
            if (entry.getValue()>1) {
                System.out.print(entry.getKey());
            }
        }
    } 
}
