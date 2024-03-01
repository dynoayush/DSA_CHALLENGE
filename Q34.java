//N to 1 without loop
public class Q34 {
    public static int[] printNos(int x) {
    if(x>0){
        System.out.print(x+" ");
        int [] result = printNos(x-1);
        return result;
    }
      return new int[0];
}


    public static void main(String[] args)
    {
        int n = 10;
        printNos(n);
    }
}
