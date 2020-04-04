import java.util.Stack;

public class Solution_1_3_10 {

    public static String InfixToPostfix(String infix) {
        Stack<String> numberStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();
        String[] stringArray = infix.split(" ");

        return "";
    }

    public static void main(String[] args) {
        String infix = "( ( 1 + 2 ) * ( ( 13 - 4 ) * ( 5 - 6 ) ) )";
        System.out.println(InfixToPostfix(infix));
    }
}
