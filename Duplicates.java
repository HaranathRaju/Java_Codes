import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5,6,6,6};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}