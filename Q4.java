public class Q4 {
    public static long reverse(long n) {
            // Write your code here
            long reverse=0;
            while(n!= 0){
                long digit = n%10;
                n=n/10;
                reverse = reverse*10+digit;
            }
            return reverse;
        }
        public static void main(String[] args){
            long n=264;
            System.out.println(reverse(n));
        }
    }


