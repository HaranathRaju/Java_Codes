public class MaxMinArray {
    public static void main(String[] args) {
        int arr []={2,4,7,6,5,9};
        int max=arr[0];
        int min=arr[1];
        for (int i=0;i<arr.length;i++) {
            if (arr[i]>max) {
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("maximum value in array: "+max);
        System.out.println("minimum value in array: "+min);
    }
}
