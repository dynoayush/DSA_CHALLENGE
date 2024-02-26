public class Q27 {
    public static void alphaHill(int n) {
        // Write your code here
            int c=65;
            for(int i =1;i<=n;i++){
                for (int k = n - i; k > 0; k--) {
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print((char)c+" ");
                    c++;
                }
                for(int j=i-1;j>=1;j--){
                    System.out.print((char)(c-2)+" ");
                    c--;
                }

                System.out.println();
                c=65;
            }

        }

    public static void main(String[] args){
        int n=3;
        alphaHill(n);
    }
}