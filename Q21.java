public class Q21 {

        public static void nBinaryTriangle(int n) {
            // Write your code here.
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print((j+(i+1))%2+" ");
                }
                System.out.println();
            }
        }

    }

