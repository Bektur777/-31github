package dataStructures.stack;

import java.util.LinkedList;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * Implement the MinStack class:
 * <p>
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 */

public class MinStack {

    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.addLast(val);

        if (!minStack.isEmpty()) {
            val = Math.min(val, minStack.getLast());
        }
        minStack.addLast(val);
    }

    public void pop() {
        stack.removeLast();
        minStack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.getLast();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}
