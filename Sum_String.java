public class Sum_String {
    public static void main(String[] args) {
        String s="12java34";
        int sum=0;
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (!alphabets.contains(Character.toString(c))) {
                sum+=c - '0';
            } 
        }
        System.out.println(sum);
    }
}
