// Nth Fibonacci Number
import java.util.Scanner;
public class Q44 {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int nfibonacci = fibonacci(n);
        System.out.println(nfibonacci);
    }
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
