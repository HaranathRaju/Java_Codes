public class SumAverageArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int sum=0;
        int average=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        average=sum/arr.length;
        System.out.println("sum of array elements :"+sum);
        System.out.println("average of array elements : "+average);
    }
}

