public class SubArray {
    public static void main(String[] args) {
        int target=12;
        int [] arr={1,3,4,5,7};
        for (int i=0;i<arr.length;i++) {
            int sum=0;
            for (int j=i;j<arr.length;j++) {
                sum+=arr[j];
                if (sum==target) {
                    System.out.print("subarray: ");
                    for (int k=i;k<=j;k++)  {
                        
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }   
    }  
}
