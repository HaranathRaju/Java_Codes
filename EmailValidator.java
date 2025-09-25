public class EmailValidator {
    public static boolean isValidEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            return false;
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
        if (atIndex <= 0 || atIndex == email.length() - 1) {
            return false;
        }
        if (dotIndex < atIndex + 2 || dotIndex == email.length() - 1) {
            return false;
        }
        if (email.indexOf('@', atIndex + 1) != -1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String email1 = "test@gmail.com";
        String email2 = "invalid@com";
        System.out.println(email1 + " → " + isValidEmail(email1)); // true
        System.out.println(email2 + " → " + isValidEmail(email2)); // false
    }
}