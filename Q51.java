// Move Zero's to End
public class Q51 {
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        n = a.length;
        int j=0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        return a;
    }
}
