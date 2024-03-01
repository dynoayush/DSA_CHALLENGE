//Print n times without using loop
import java.util.*;
public class Q32 {
    public static List<String> printNtimes(int n) {
        // Write your code here.
        List<String> result = new ArrayList<>();
        printNrecursion(n, result);
        return result;

    }

    public static void printNrecursion(int n, List<String> result) {
        if (n > 0) {
            result.add("Coding Ninjas");
            printNrecursion(n - 1, result);
        }
    }
}


