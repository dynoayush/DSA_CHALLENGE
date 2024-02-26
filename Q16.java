public class Q16 {

        public static void nNumberTriangle(int n) {
            // Write your code here
            for (int i=0;i<n;i++){
                for(int j=n;j>i;j--){
                    System.out.print(n-j+1+" ");
                }
                System.out.println();
            }
        }
        public static void main(String [] args){
            int n =3;
            nNumberTriangle(n);
        }

    }

