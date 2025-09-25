public class ReverseNumbers {
    public static void main(String[] args) {
        String s="a1b2c3d4";
        String digits="";
        String result="";
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (Character.isDigit(c)) {
                digits+=c;
            } 
        }
        int digitindex=digits.length()-1;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (Character.isDigit(c)) {
                result+=digits.charAt(digitindex);
                digitindex--;
            } else {
                result+=c;
            }
        }
        System.out.println(result);
    }
}








