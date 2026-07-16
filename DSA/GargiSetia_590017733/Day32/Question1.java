import java.util.*;
class Solution {
    public int minLength(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!stack.isEmpty() &&
                (ch - stack.peek() == 1) &&
                (stack.peek() == 'A' || stack.peek() == 'C')) {

                stack.pop();

            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }
}
