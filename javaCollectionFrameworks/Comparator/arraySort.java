package javaCollectionFrameworks.Comparator;

import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        Integer[] a = {1, 6, 4, 5, 7, 3};
        Arrays.sort(a);
        Arrays.sort(a,new revArrayComparator());
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
