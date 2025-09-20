import java.util.ArrayList;
public class Duplicates {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,6,7,7,7,7,7};
        ArrayList<Integer> l=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if  (!l.contains(arr[i])) {
                l.add(arr[i]);
            } 
        }
        System.out.println(l);
    }   
}
