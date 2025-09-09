public class NoofVowels {
    public static void main(String[] args) {
        int count=0;
        String vowels="aeiouAEIOU";
        String s="hyderabad";
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (vowels.contains(Character.toString(c))) {
                count++;
            }
        }
        System.out.println("there are "+count+" vowels in the string");
    }
}
