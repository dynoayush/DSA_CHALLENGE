public class Q24 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        int k =65;
        for(int i = 1;i<=n;i++){
            for(int j=i;j>=1;j--){

                System.out.print((char)k+" ");
                k++;
            }
            System.out.println();
            k=65;
        }
    }
    public static void main(String[] args){
        int n = 3;
        nLetterTriangle(n);
    }
}
