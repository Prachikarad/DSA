/**
 * LeetCode Problem: 20. Valid Parentheses
 * Difficulty: Easy
 * Approach: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket
            else {

                // If stack is empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack empty → valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String test1 = "()[]{}";
        String test2 = "(]";
        String test3 = "({[]})";

        System.out.println(test1 + " -> " + isValid(test1));
        System.out.println(test2 + " -> " + isValid(test2));
        System.out.println(test3 + " -> " + isValid(test3));
    }
}