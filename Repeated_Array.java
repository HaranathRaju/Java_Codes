import java.util.ArrayList;
public class Repeated_Array {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5};
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (!list1.contains(arr[i])) {
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        } 
        for (int i=0;i<list2.size();i++) {
            System.out.println(list2.get(i));
        }
    }
}

