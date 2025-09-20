import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,2,2,3,3,4,4,4,4,5,5};
        for (int n:arr) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (int x:map.keySet()) {
            System.out.println(x+" = "+map.get(x));
        }
    }
}
