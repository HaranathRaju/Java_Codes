public class Remove_vowels {
    public static void main(String[] args) {
        String s="hyderabad";
        String a="";
        String vowels="aeiou";
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (!vowels.contains(Character.toString(c))) {
                a+=Character.toString(c);
            } 
        }
        System.out.println(a);
    }
}