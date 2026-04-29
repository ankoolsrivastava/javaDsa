package javaCollectionFrameworks.Collection.List.Queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListMethods {

    public static void main(String[] args) {
        Queue<Integer> Queue = new LinkedList<>();
        Queue.offer(10);
        Queue.offer(90);
        Queue.offer(60);
        Queue.offer(40);
        Queue.offer(50);
        System.out.println(Queue);

//         returns first element(Head)
        System.out.println("Returns the first Element: " + Queue.peek());
        System.out.println(Queue);

//          returns and removes head(first element)
        System.out.println("Removes And Returns the First Element: " + Queue.poll());
        System.out.println(Queue);


    }
}