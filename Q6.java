//You are given two integers 'n', and 'm'.
//Calculate 'gcd(n,m)', without using library functions
public class Q6 {
    public static int calcGCD(int n, int m){
            // Write your code here.
            if(m==0){
                return n;
            }
            return calcGCD(m,n%m);
        }
        public static void main(String[] args){
            int n=6,m=4;
            int answer = calcGCD(n,m);
            System.out.println(answer);
        }
    }

