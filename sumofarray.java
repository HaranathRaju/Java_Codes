public class sumofarray {
    public static void main(String[] args) {
        int s=0;
        int [] arr={1,2,3,4,5,6};
        for (int i=0;i<arr.length;i++) {
            s+=arr[i];
        }
        System.out.println(s);

    }
}