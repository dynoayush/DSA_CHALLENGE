public class Q26 {
    public static void alphaRamp(int n) {
        // Write your code here
        int c=65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) c + " ");
            }
            System.out.println();
            c++;
        }
    }
    public static void main(String[] args){
        int n=3;
        alphaRamp(n);
    }
}
