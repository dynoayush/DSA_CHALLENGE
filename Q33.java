//1 to N Without Loop
public class Q33 {
    public static int[] printNos(int x) {
        // Write Your Code Here
        if(x>0){
            int [] result = printNos(x-1);
            System.out.print(x+ " ");
            return result;
        }
        return new int[x];
    }
    public static void main(String[] args)
    {
        int n = 10;
        printNos(n);
    }
}

