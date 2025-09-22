import java.util.HashMap;
import java.util.Scanner;
public class FrequencyString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=sc.nextLine();
        HashMap<Character,Integer> freq=new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c!=' ') {
                freq.put(c,freq.getOrDefault(c,0)+1);
            }
        }
        for (char x:freq.keySet()){
            System.out.print(x+"="+freq.get(x)+" ");
        }   
    }
}




