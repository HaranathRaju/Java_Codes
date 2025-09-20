import java.util.Arrays;
import java.util.Scanner;
public class ArrayInitialization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for (int i=0;i<arr.length;i++) {
            System.out.print("enter the element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("obtained array : "+Arrays.toString(arr));
    }
}
