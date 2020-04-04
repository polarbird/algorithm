import java.util.Stack;

public class Solution_1_3_9 {

    public static String completion(String input) {
        String[] stringArray = input.split(" ");
        Stack<String> stack = new Stack<>();
        for (String s : stringArray) {
            if (!s.equals(")")) {
                stack.push(s);
            } else {
                String right = stack.pop();
                String operator = stack.pop();
                String left = stack.pop();
                String temp = "( " + left + " " + operator + " " + right + " )";
                stack.push(temp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "1 + 2 ) * 13 - 4 ) * 5 - 6 ) ) )";
        System.out.println(completion(s));
    }
}
