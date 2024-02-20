//Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.
public class Q1 {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] ={8,6,2,5,1};
        int n=5;
        System.out.println("Original Array");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Array in non-decreasing order");
        printArray(arr);
    }
}



