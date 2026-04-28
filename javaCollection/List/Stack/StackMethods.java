package javaCollection.List.Stack;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();

        // push(E e) → adds element to top
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // peek() → returns top element (no removal)
        System.out.println("Top element: " + stack.peek());

        // pop() → removes and returns top element
        System.out.println("Popped: " + stack.pop());

        System.out.println("After pop: " + stack);

        // empty() → checks if stack is empty
        System.out.println("Is empty? " + stack.empty());

        // search(Object o) → position from top (1-based index)
        System.out.println("Position of 10: " + stack.search(10));

        // size() → number of elements
        System.out.println("Size: " + stack.size());

        // contains(Object o) → checks existence
        System.out.println("Contains 20? " + stack.contains(20));

        // add(E e) → also adds element (same as push, but not stack-specific)
        stack.add(40);

        System.out.println("After add: " + stack);

        // remove(Object o) → removes element
        stack.remove(Integer.valueOf(20));

        System.out.println("After remove: " + stack);

        // clear() → removes all elements
        stack.clear();

        System.out.println("After clear: " + stack);
    }
}