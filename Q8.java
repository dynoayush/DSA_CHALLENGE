public class Q8 {
    public static int sumOfAllDivisors(int n){
            // Write your code here.
            int totalsum=0;
            for(int i = 1; i <= n; i++){
                totalsum += sumofDivisorssum(i);
            }
            return totalsum;
        }
        public static int sumofDivisorssum(int num){
            int sum=0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    sum+=i;
                }
            }
            return sum;
        }
        public static void main(String[] args){
            int n=36;
            int num=10;
            int sum = sumOfAllDivisors(n);

        }

    }














