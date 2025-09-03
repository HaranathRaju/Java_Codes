import java.util.ArrayList;

public class fibinocci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            a = b;
            b = c;
            numbers.add(c);
        }
        System.err.println(numbers);
    }
}

