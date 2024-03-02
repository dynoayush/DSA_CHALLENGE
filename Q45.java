//  Sum of even & odd
import java.util.Scanner;
public class Q45 {



        public static void main(String[] args) {
            // Write your code here
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            calculateAndPrintDigitSums(n);
        }
        public static void calculateAndPrintDigitSums(int n) {

            int evenSum = 0;
            int oddSum = 0;
            while (n > 0) {
                int digit = n % 10;
                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                n /= 10;
            }
            System.out.println( evenSum+" "+oddSum);

        }
    }


