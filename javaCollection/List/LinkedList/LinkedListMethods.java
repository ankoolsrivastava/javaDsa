package javaCollection.List.LinkedList;
import java.util.*;
//import java.util.LinkedList;
//import java.util.List;

public class LinkedListMethods {

        public static void main(String[] args) {
        // Creating LinkedList
            LinkedList<Integer> list = new LinkedList<>();

        //  adds element at end
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(20);

            //  adds element at beginning
            list.addFirst(5);

            // adds element at end
            list.addLast(40);
            list.add(39);

            System.out.println("List: " + list);

            // returns element at index
            System.out.println("Element at index 2: " + list.get(2));

            // returns first element
            System.out.println("First element: " + list.getFirst());

            // returns last element
            System.out.println("Last element: " + list.getLast());

            // returns first occurance of the element means when the first time th element appeared;
            System.out.println(" First time occurance index of element" + list.indexOf(20));

            // returns last occurance of the element means when the last time th element appeared;
            System.out.println("Last time occurance index of element: " + list.lastIndexOf(20));

            // replaces element and returns old value
            list.set(2, 99);

            System.out.println("After set: " + list);

            // removes first element
            list.remove();

            // removes element at index
            list.remove(1);

            // removes first element
            list.removeFirst();

            // removes last element
            list.removeLast();

            System.out.println("After removals: " + list);

            // checks if element exists
            System.out.println("Contains 99? " + list.contains(99));

            //  returns number of elements
            System.out.println("Size: " + list.size());

            // removes all elements
            list.clear();

            System.out.println("After clear: " + list);

            //  adds all elements from another list
            LinkedList<Integer> list2 = new LinkedList<>();
            list2.add(1);
            list2.add(2);

            list.addAll(list2);

            System.out.println("After addAll: " + list);

            // shallow copy (returns Object → cast required)
            LinkedList<Integer> copy = (LinkedList<Integer>) list.clone();

            System.out.println("Cloned list: " + copy);

            //  returns first(head) element (no removal, safe if empty)
            System.out.println("Peek: " + list.peek());

            // removes and returns first element
            System.out.println("Poll: " + list.poll());

            System.out.println("After poll: " + list);

            System.out.println("Final list: " + list);
        }
    }

