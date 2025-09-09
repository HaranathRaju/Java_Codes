public class Toggle_string {
    public static void main(String[] args) {
        String a="hyDErabAD";
        String b="";
        for (int i=0;i<a.length();i++) {
            char c=a.charAt(i);
            if (Character.isUpperCase(c)) {
                b+=Character.toString(c).toLowerCase();
            }
            else {
                b+=Character.toString(c).toUpperCase();
            }
        }
        System.out.println(b);
    }
}