public class array {
    public static void main (String [] args) {
        int [] a={1,2,3,4,4,4,5,5,6};
        int max=0;
        int most=a[0];
        for ( int i=0;i<a.length;i++) {
            int count=0;
            for (int j=0;j<a.length;j++) {
                if (a[i]==a[j]) {
                    count++;
                }
            }    
                if (max<count) {
                    max=count;
                    most=a[i];
                }
            }
        System.out.println(max);
        System.out.println(most);
    }
}    
