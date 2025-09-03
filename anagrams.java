import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String s = "silent";
        String p = "listen";
        char[] arr1 = s.toCharArray();
        char[] arr2 = p.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }
    }
}