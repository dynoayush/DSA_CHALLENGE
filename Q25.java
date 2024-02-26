public class Q25 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i =1;i<=n;i++){
            for(char j ='A';j<='A'+(n-i);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 3;
        nLetterTriangle(n);
    }
}
