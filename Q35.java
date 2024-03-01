//Sum Of First N Numbers
public class Q35 {

        public static long sumFirstN(long n) {
            // Write your code here.
            long sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println(sum);
            return sum;
        }
        public static void main(String[] args){
            sumFirstN(3);
        }
    }

