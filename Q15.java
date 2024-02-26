public class Q15 {

        public static void seeding(int n) {
            // Write your code here
            for(int i=0;i<n;i++){
                for(int j=n;j>i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void main(String [] args){
            int n =3;
            seeding(n);
        }

    }

