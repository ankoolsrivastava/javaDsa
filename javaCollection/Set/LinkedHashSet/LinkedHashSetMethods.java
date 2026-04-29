package javaCollection.Set.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// elements stored  same as insertion O(n)
public class LinkedHashSetMethods {


    public static void main(String[] args) {
        Set<Integer> set1=new LinkedHashSet<>();
        Set<Integer> set2=new LinkedHashSet<>();
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
