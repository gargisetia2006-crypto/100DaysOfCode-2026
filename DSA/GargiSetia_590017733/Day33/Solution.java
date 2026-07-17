import java.util.Stack;

public class Solution {

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (isOperator(ch)) {
                String op2 = stack.pop();
                String op1 = stack.pop();

                String temp = ch + op1 + op2;
                stack.push(temp);
            } else {
                stack.push(String.valueOf(ch));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "AB+CD-*";
        System.out.println(postfixToPrefix(s));
    }
}