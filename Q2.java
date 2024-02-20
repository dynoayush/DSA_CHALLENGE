// You are given an integer array 'arr' of size 'N'.
//You must sort this array using 'Bubble Sort'..
public class Q2 {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]= {2,13,4,1,3,6,28};
        int n=7;
        System.out.println("Given array");
        printArray(arr);
        bubbleSort(arr, n);
        System.out.println("Sorted Array Bubble Sort");
        printArray(arr);
    }
}
