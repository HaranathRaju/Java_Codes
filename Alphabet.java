public class Alphabet {
    public static void main (String [] args) {
        char a='N';
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        if (alphabets.contains(Character.toString(a).toLowerCase())) {
            System.out.println("it is an alphabet");
        }
        else {
            System.out.println("it is not an alphabet");
        }
    }
}