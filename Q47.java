// Second Largest Number
public class Q47 {
    public static int[] getSecondOrderElements(int n, int []a) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int arr[]={a[n-2],a[1]};
        return arr;


    }
}
