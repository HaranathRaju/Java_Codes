public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 10, 14, 18 };

        int length = arr.length + 1;
        int d = (arr[arr.length - 1] - arr[0]) / length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != d) {
                System.out.println("Missing number: " + (arr[i] + d));
                break;
            }
        }
    }
}
