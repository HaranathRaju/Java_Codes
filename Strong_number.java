public class Strong_number {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int ld = num % 10;
            int fact = 1;
            for (int i = 1; i <= ld; i++) {
                fact = fact * i;
            }
            sum += fact;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("strong number");

        } else {
            System.out.println("not a strong number");
        }
    }

}