package javaCollectionFrameworks.Collection.List.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

//set don't allow duplicates
// elements storage is done using hashcode O(1)
public class HashSetMethods {
    public static void main(String[] args) {
    Set<Integer> set1=new HashSet<>();
    Set<Integer> set2=new HashSet<>();
        set1.add(1);
        set1.add(20);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println(set1);
        System.out.println(set2);
//        retainAll() --> make intersection i.e., common to both  in set1.
        set1.retainAll(set2);
        System.out.println(set1);

        System.out.println(set1.contains(3));
        System.out.println(set1.containsAll(set2));
}
}
