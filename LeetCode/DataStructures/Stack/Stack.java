package dataStructures.stack;

public class Stack {

    public static void main(String[] args) {
        String test1 = "{{}}}{{{}";
        String test2 = "";
        String test3 = "(({}))";
        String test4 = "({)}";

        System.out.println(isBalanced(test1));
        System.out.println(isBalanced(test2));
        System.out.println(isBalanced(test3));
        System.out.println(isBalanced(test4));

    }

    static boolean isBalanced(String str) {
        java.util.Stack<Character> characters = new java.util.Stack<>();

        if (str.isEmpty()) {
            return false;
        }

        for (Character ch : str.toCharArray()) {
            if (isOpen(ch)) {
                characters.push(ch);
            }
            else {
                if (!characters.isEmpty() && isPair(characters.peek(), ch)) {
                    characters.pop();
                }
                else {
                    return false;
                }
            }
        }

        return characters.isEmpty();
    }

    static boolean isOpen(char ch) {
        return '{' == ch || '(' == ch || '[' == ch;
    }

    static boolean isPair(char open, char close) {
        return open == '[' && close == ']' ||
                open == '{' && close == '}' ||
                open == '(' && close == ')';
    }

}
