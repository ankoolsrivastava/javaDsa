package javaCollectionFrameworks.Collection.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArrayDequeMethods {
    static void main(String[] args) {


        Queue<Integer> Queue = new ArrayDeque<>();
        Queue.offer(10);
        Queue.offer(30);
        Queue.offer(40);
        Queue.offer(20);
        // Deque.offerFirst(90);
        // Deque.offerLast(30);
        System.out.println(Queue);
        System.out.println("Returns First Element " +Queue.peek());
        System.out.println(Queue);
        // System.out.println("Returns Last Element "+Deque.peekLast());
        // System.out.println(Deque);
        // System.out.println ("Return and Removes Last Element "+Deque.pollLast());
        // System.out.println(Deque);
        // System.out.println("Return And Removes First Element "+Deque.pollFirst());
        // System.out.println(Deque);

        System.out.println("Return And Removes First Element " + Queue.poll());
        System.out.println(Queue);


    }
}

