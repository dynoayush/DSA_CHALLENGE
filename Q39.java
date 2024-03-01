// Print Fibonacci Series
public class Q39 {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] result = new int[n];
        result[0] = 0;

        if (n==0) {
            return result;
        }
        else if (n==1) {

            return result;
        }
        else{
            if(n==2){
                result[1]=1;
                return result;}
            else{

                for (int i = 2; i< n; i++) {
                    result[0] = 0;
                    result[1] = 1;
                    result[i] = result[i - 1] + result[i - 2];
                }
                return result;
            }
        }

    }

    public static void main(String [] args){
        int n = 5;
        int[] fibonacciNumbers = generateFibonacciNumbers(n);


        for (int num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }
}
