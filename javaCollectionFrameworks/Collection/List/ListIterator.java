package javaCollectionFrameworks.Collection.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ListIterator {
    static void main(String[] args) {
        ArrayList<Integer> arr2= new ArrayList<>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);
        arr2.add(40);
        arr2.add(50);
        arr2.add(60);
        Iterator<Integer> iterator= arr2.iterator(); // Create Iterator for arr2(arrayList)
        while(iterator.hasNext()) // check if it has next element in the list, The Loops run until it don't have any
        {
            System.out.println("Element in arr2 are : "+iterator.next()); // we can access those element using .next();
        }
    }
}

