//You are given an integer ‘n’.
//Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.
public class Q10 {
    public static int[] printNos(int x) {
            // Write Your Code Here
            if(x>0){
                int [] result = printNos(x-1);
                System.out.print(x+ " ");
                return result;
            }
            return new int[x];
        }
        public static void main(String[] args){
            int[] n ={4};
            for(int i =0;i<n.length;i++){
                printNos(n[i]);
            }
        }
    }





