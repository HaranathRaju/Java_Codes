import java.util.*;

public class LongestSubstringMap {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxlength = 0;
        int start = 0;
        int maxStart = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }
            map.put(c, i);

            if (i - start + 1 > maxlength) {
                maxlength = i - start + 1;
                maxStart = start;
            }
        }
        System.out.println("Length: " + maxlength);
        System.out.println("Longest substring: " + s.substring(maxStart, maxStart + maxlength));
    }
}

