//  Remove Duplicates from Sorted Array
public class Q49 {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        if(arr.length == 0){
            return 0;
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

}


























