public class Q20 {
    public static void nStarTriangle(int n) {
            // Write your code here
            int a = n;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 1; i <= a - 1; i++) {
                for (int j = 1; j <= n - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                n--;
            }
        }


    }

