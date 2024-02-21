import java.util.*;
public class Q7 {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int originalnumber = n;
            int count = 0;
            int temp = n;
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            int sumofdigits=0;
            while (n!=0){
                int lastdigit = n%10;
                sumofdigits += Math.pow(lastdigit,count);
                n/=10;
            }
            if(sumofdigits==originalnumber)
                System.out.println(true);
            else System.out.println(false);
        }
    }












