// Find Character Case
import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = scanner.next().charAt(0);
        int result = checkCharacterType(inputChar);
        System.out.println(result);
    }

    public static int checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return 1;
        } else if (ch >= 'a' && ch <= 'z') {
            return 0;
        } else {
            return -1;
        }
    }
}
