public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int l = 0;
        int ans = 0;
        int temp = num;
        int current = num;

        while (num > 0) {
            num = num / 10;
            l++;
        }
        while (temp > 0) {
            int ld = temp % 10;
            ans = ans + (int) Math.pow(ld, l);
            temp = temp / 10;
        }
        if (ans == current) {
            System.out.println("armstrong.");
        } else {
            System.out.println("not armstrong.");
        }

    }

}