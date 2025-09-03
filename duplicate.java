import java.util.ArrayList;
public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int [] a={1,2,3,4,5,6,6,6,7,7,8,3,2,4};
        for (int i=0;i<a.length;i++) {
            if (!numbers.contains(a[i])) {
                numbers.add(a[i]);
            }
        }
        System.out.println(numbers);
    }
}


