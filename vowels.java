import java.util.ArrayList;
import java.util.List;

public class vowels {
    public static void main(String[] args) {
        List<Character> arr = new ArrayList<>();
        String s = "haranath";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                arr.add(c);
                count += 1;
            }
        }
        System.out.println(arr);
        System.out.println("vowels are:" + count);

    }
}