public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (sec < arr[i] && arr[i] != max) {
                sec = arr[i];
            }
        }
        System.out.println(sec);
        System.out.println(max);
    }
}
