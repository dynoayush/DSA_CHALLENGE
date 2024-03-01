//Factorial Numbers Not Greater Than N
import java.util.*;
public class Q36 {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> factorialList = new ArrayList<>();
        long ans = 1;

        for (int i = 1; ans <= n; i++) {
            factorialList.add(ans);
            ans=ans*i;
        }
        return factorialList;
    }
    public static void main(String[] args) {

        long n = 7;
        List<Long> result = factorialNumbers(n);
        System.out.println("The factorial of " + n + " is " + result);
    }
    }

