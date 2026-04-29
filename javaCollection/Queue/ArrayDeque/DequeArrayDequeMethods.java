package javaCollection.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArrayDequeMethods {
        public static void main(String[] args) {
            Deque<Integer> Deque=new ArrayDeque<>();
            Deque.offer(10);
            Deque.offer(30);
            Deque.offer(40);
            Deque.offer(20);
            Deque.offerFirst(90);
            Deque.offerLast(30);
            System.out.println(Deque);
            System.out.println("Returns First Element "+Deque.peek());
            System.out.println(Deque);
            System.out.println("Returns Last Element "+Deque.peekLast());
            System.out.println(Deque);
            System.out.println ("Return and Removes Last Element "+Deque.pollLast());
            System.out.println(Deque);
            System.out.println("Return And Removes First Element "+Deque.pollFirst());
            System.out.println(Deque);

        }

}
