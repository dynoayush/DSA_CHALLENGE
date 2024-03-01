// Switch case statement
public class Q43 {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch (ch) {
            case 1:
                if (a.length >= 1) {
                    double r = a[0];
                    return Math.PI * r * r;
                } else {
                    return -1;
                }

            case 2:
                if (a.length >= 2) {
                    double l = a[0];
                    double b = a[1];
                    return l * b;
                } else {

                    return -1;
                }

            default:
                return -1;
        }
    }
}
