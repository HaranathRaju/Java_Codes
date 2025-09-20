import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        int [] arr1={1,3,4,5};
        int [] arr2={1,2,6,7,8};
        int [] arr=new int [arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr,0,arr1.length);
        System.arraycopy(arr2,0,arr,arr1.length,arr2.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
