public class Perfect_Square {
    public static void main(String[] args) {
        int num = 49;
        int sqrt = (int) Math.sqrt(num);

        if (sqrt * sqrt == num) {
            System.out.println("perfect square");
        } else {
            System.out.println("not a perfect square");
        }
    }
}