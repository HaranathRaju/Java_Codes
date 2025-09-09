public class Vowel {
    public static void main(String[] args) {
        String vowels ="aeiouAEIOU";
        char a='e';
        if (vowels.contains(Character.toString(a))) {\
            System.out.println("it is vowel");
        } else {
            System.out.println("it is a consonant");
        }
    }
}