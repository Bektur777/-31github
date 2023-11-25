package Stack;


import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String test1 = "()())(((((((";
        String test2 = "))))))()()(";
        String test3 = "(())";
        String test4 = "()(()";

        System.out.println(longestValidParentheses(test1));
        System.out.println(longestValidParentheses(test2));
        System.out.println(longestValidParentheses(test3));
        System.out.println(longestValidParentheses(test4));
    }

    /**
     * (    [-1, 0]
     * )    [-1]    len = [-1, 1 - (-1)] -> 2
     * (    [-1, 2]
     * (    [-1, 2, 3]
     * )    [-1, 2] len = [2, 2 - (2)] -> 3
     */

    static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int len = 0;

        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                }
                else {
                    len = Math.max(len, i - stack.peek());
                }
            }
        }

        return len;
    }

}
