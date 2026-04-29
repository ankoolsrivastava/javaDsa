package javaCollection.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackMethods {
    static void main(String[] args) {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
