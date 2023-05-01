package leetcode.easy.solved;

import java.util.Stack;

public class easy20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                stack.push(temp);
            } else {
                if (!stack.isEmpty()) {
                    if (temp == ')' && stack.peek() != '(') {
                        return false;
                    } else if (temp == ']' && stack.peek() != '[') {
                        return false;
                    } else if (temp == '}' && stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (stack.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
