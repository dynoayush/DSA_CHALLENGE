// Reverse an Array
public class Q37 {

    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int start = 0;
        int end = n - 1;

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return nums;

    }
}
