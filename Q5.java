//Check whether a given number ’n’ is a palindrome number.
//Palindrome numbers are the numbers that don't change when reversed.
import java.util.Scanner;

public class Q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palindromeNumber(n))System.out.println(true);
        else System.out.println(false);
    }
    static boolean palindromeNumber(int n){
        int s=0;
        int a=n;
        int d=0;
        while(n!=0){
            d=n%10;
            s=s*10+d;
            n=n/10;
        }
        if(s==a)return true;
        else return false;
    }
}










