import java.util.Arrays;
import java.util.Scanner;


public class AnagramsString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string 1: ");
        String s1=sc.nextLine();
        System.out.print("enter the string 2: ");
        String s2=sc.nextLine();
        char [] arr1=s1.toCharArray();
        char [] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)) {
            System.out.println("two strings are anagrams");
        }else {
            System.out.println("two strings are not anagrams");
        }
    }
    
}
