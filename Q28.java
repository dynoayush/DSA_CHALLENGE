public class Q28 {
    public static void alphaTriangle(int n) {
        int c=65;
        int a=n;
        for(int i=1;i<=a;i++){
            for(int j=i;j>=1;j--){
                System.out.print((char)(c+n-1)+" ");
                n--;
            }
            System.out.println();
            c=65;
            n=a;
        }
}
public static void main(String[] args){
        int n=3;
        alphaTriangle(n);
}
}
