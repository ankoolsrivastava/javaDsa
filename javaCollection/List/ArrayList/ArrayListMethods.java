package javaCollection.List.ArrayList;
import java.util.*;
// ArrayList Method :
//      sort()
//      clone()
//      ensureCapacity()
//      isEmpty()
//      indexof()


public class ArrayListMethods {
    static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(70);
        arr.add(30);
        arr.add(60);
        arr.add(80);
        arr.add(20);
        arr.add(40);
        System.out.println("ArrayList: "+arr);

//  Sorting the ArrayList

        Collections.sort(arr);
        System.out.println("Sorted array  in Ascending:"+arr); // Ascending order
        arr.sort(null); // can also be used for sorting
        System.out.println("Sorted array  in Ascending (Method2):"+arr);

        //Descending order sorting
        arr.sort(Collections.reverseOrder());
        System.out.println("Sorted array  in Descending:"+arr);


//  cloning the old list to new
//  ---------------------------
//  clone() creates a SHALLOW COPY of the ArrayList
//  - It returns an Object, so we must typecast it to ArrayList
//  - Shallow copy means:
//     > A new list is created
//     > Elements are NOT copied deeply (references are copied)


        ArrayList<Integer>arr2=(ArrayList<Integer>)arr.clone();
        System.out.println("Copy of arr to arr2: "+arr2);




// ensureCapacity()--> increases internal capacity to at least 50 .
// does NOT change size; just pre-allocates memory to avoid repeated resizing during additions


        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.ensureCapacity(50); // If you add more than 50 elements -> ArrayList automatically resizes

//  Checking if ArtrayList is Empty otr not returns Boolean;
        System.out.println(arr3.isEmpty());
        System.out.println(arr2.isEmpty());

//  Finding the index of an element in an ArrayList
        System.out.print(arr.indexOf(30)); //The output will be 4 as we did Descending operation so 30 is at index 4;
}
}
