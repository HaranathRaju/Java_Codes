public class duplicate_string {
    public static void main(String[] args) {
        String s = "haranath";
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!a.contains(String.valueOf(c))) {
                a += c;
            }
        }
        System.out.println(a);
    }
}