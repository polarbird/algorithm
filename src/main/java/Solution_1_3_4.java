import java.util.Stack;

public class Solution_1_3_4 {

    public static boolean Parentheses(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        char prev = ' ';

        for (char c : chars) {
            if (stack.size() != 0) {
                prev = stack.peek();
            }
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && prev == '(') {
                stack.pop();
            } else if (c == ']' && prev == '[') {
                stack.pop();
            } else if (c == '}' && prev == '{') {
                stack.pop();
            } else {
                break;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}";
        String s2 = "[(])";
        System.out.println(Parentheses(s2));
    }
}
