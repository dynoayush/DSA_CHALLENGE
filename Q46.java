//Largest Element in the Array
import java.util.* ;
import java.io.*;

public class Q46 {
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
}
