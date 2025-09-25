import java.util.*;

public class LongestSubstringMap {
    public static void main(String[] args) {
        String s = "abcabcbb";

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, i);

            if (i - left + 1 > maxLen) {
                maxLen = i - left + 1;
                longest = s.substring(left, i + 1);
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLen);
    }
}
