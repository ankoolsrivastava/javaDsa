package javaCollection.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;
// elements stored in sorted order 0(logn)--> based on BST
public class TreeSetMethods {
    public static void main(String[] args) {
        Set<Integer> set1=new TreeSet<>();
        Set<Integer> set2=new TreeSet<>();
        set1.add(12);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println(set1);

    }
}
