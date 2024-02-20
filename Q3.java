// You are given a number ’n’.
//Find the number of digits of ‘n’ that evenly divide ‘n’.
public class Q3 {
    public static int countDigits(int n){
        // Write your code here.
        int temp=n,count =0;
        while(temp!=0) {
            int d = temp % 10;
            temp /= 10;
            if (d > 0 && n % d == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n=366;
        System.out.println(countDigits(n));
    }
}


