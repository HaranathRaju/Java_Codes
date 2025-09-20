import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        ArrayList<Integer> l=new ArrayList<>();
        for (int i=arr.length-1;i>=0;i--) {
            l.add(arr[i]);
        }    
        System.out.println("reversed array : "+l);    
    }
}
