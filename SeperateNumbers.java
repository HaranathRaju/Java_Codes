public class SeperateNumbers {
    public static void main(String[] args) {
        int [] arr={1,-2,4,-5,6,7,-9,3,-6,8,-12};
        System.out.print("positive numbers: ");
        for (int num:arr) {
            if (num>0) {
                System.out.print(num +" ");
            }
        }
        System.out.println();
        System.out.print("negative numbers: ");
        for (int num:arr) {
            if (num<0) {
                System.out.print(num+ " ");
            }
        }
    }
}
