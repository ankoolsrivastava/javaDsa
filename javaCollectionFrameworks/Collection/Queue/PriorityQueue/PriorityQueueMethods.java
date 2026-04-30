package javaCollectionFrameworks.Collection.Queue.PriorityQueue;

import java.util.*;


public class PriorityQueueMethods {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
//        Default Behaviour --> Integer --> Less Value -->High Priority(minHeap Working)
        pq.offer(40);
        pq.offer(90);
        pq.offer(10);
        pq.offer(30);
        pq.offer(60);
        pq.offer(70);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println("----------------------------------------------------------------------------------------------------");


//        maxHeap --> Integer --> High value --> High Priority
//                                              COMPARATOR((a,b)->b,a)I --- IS USED here in bracket to reverse the priority
        Queue<Integer> pq2 = new PriorityQueue<>(((a, b) -> b - a));
        pq2.offer(40);
        pq2.offer(90);
        pq2.offer(10);
        pq2.offer(30);
        pq2.offer(60);
        pq2.offer(70);
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());


//        Priority Queue for Strings works Different also
//        to priority Que to work on our custom we need to
//        create a comparator(will study on it)
        Queue<Students> Pq = new PriorityQueue<>();
        Pq.offer(new Students(19, "ankool", 53));
        Pq.offer(new Students(21, "nkit", 55));
        Pq.offer(new Students(16, "Harshita", 46));
        Pq.offer(new Students(46, "reena", 67));
        while (!Pq.isEmpty()) {
            System.out.println("Custom Class Ascending order " + Pq.poll());
        }


    }
}
