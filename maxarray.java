public class maxarray {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 1, 3, 2, 5 };
        int max = arr[0];
        int sec= Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            else if (sec<arr[i] && arr[i]!=max) {
                sec=arr[i];
            }

        }
        System.out.println("maximum element in the array is:" + max);
        System.out.println("second maximum element in the array is:" + sec);
    }
}