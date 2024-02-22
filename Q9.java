// A prime number is a positive integer that is divisible by exactly 2 integers, 1 and the number itself.
//You are given a number 'n'.
//Find out whether 'n' is prime or not.
public class Q9 {
    public static String isPrime(int num) {
        if(num==1)
                return "NO";
            for (int i = 2; i*i <= num; i++) {
                if(num%i==0){
                    return "NO";
                }
            }
            return "YES";
        }
    }









