public class Q18 {

        public static void nStarTriangle(int n) {
            // Write your code here
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<n*2-(2*i+1);j++){
                    System.out.print("*");
                }
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        public static void main(String [] args){
            int n=3;
            nStarTriangle(n);
        }
    }

