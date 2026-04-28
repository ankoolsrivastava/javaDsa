package javaCollection.List.Vector;
import java.util.Collections;
import java.util.Vector;

public class VectorListMethods {
    static void main(String[] args) {
        Vector<Integer> list=new Vector<>();


        // add(E e) → adds element at end
        list.add(10);
        list.add(20);

        // add(index, element) → insert at specific index
        list.add(1, 15);

        // addElement(E e) → legacy add method
        list.addElement(25);

        System.out.println("Vector: " + list);

        // get(index) → returns element at index
        System.out.println("Element at index 1: " + list.get(1));

        // firstElement() → returns first element
        System.out.println("First: " + list.firstElement());

        // lastElement() → returns last element
        System.out.println("Last: " + list.lastElement());

        // set(index, element) → replace and return old value
        list.set(1, 100);

        // setElementAt(value, index) → legacy replace
        list.setElementAt(200, 2);

        System.out.println("After set: " + list);

        // remove(index) → remove element at index
        list.remove(1);

        // remove(Object o) → remove by value
        list.remove(Integer.valueOf(25));

        // removeElement(Object o) → legacy remove
        list.removeElement(10);

        System.out.println("After remove: " + list);

        // contains(Object o) → checks existence
        System.out.println("Contains 200? " + list.contains(200));

        // size() → number of elements
        System.out.println("Size: " + list.size());

        // capacity() → current internal capacity
        System.out.println("Capacity: " + list.capacity());

        // ensureCapacity(n) → ensures capacity
        list.ensureCapacity(50);

        // trimToSize() → reduces capacity to current size
        list.trimToSize();

        // clear() → removes all elements
        list.clear();

        System.out.println("After clear: " + list);

        // addAll(Collection c) → add all elements
        Vector<Integer> v2 = new Vector<>();
        v2.add(1);
        v2.add(2);

        list.addAll(v2);

        System.out.println("After addAll: " + list);

        // clone() → shallow copy (returns Object)
        Vector<Integer> copy = (Vector<Integer>) list.clone();

        System.out.println("Cloned: " + copy);

        // Sorting
        Collections.sort(list); // ascending
        list.sort(Collections.reverseOrder()); // descending

        System.out.println("Sorted: " + list);
    }
}
