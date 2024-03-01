// if else
public class Q42 {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        String result;
        if(a<b){
            result = "smaller";
        }
        else if(a>b){
            result = "greater";
        }
        else{
            result = "equal";
        }
        return result;
    }
}
