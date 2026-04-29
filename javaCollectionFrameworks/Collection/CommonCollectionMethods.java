package javaCollectionFrameworks;
import java.util.ArrayList;
import java.util.Collection;

//   Java Collection is an interface

//  .add()
//  .allAll()
//  .remove()
//  .removeAll()
//  .size()
//  .clear()
//  These operation is common to all colections

public class CommonCollectionMethods {
    public static void main(String[] args) {


        Collection<Integer> arr = new ArrayList<>();

        //  can also use this 2 instead also works
        //  List and collection cannot be used for creating the  implementation, it must be of concrete class (arraylist,etc)
        //  reference List<Integer>
        //  List<Integer> List = new ArrayList<>();
        //  Collection<Integer> Collection = new ArrayList<>();


        //  ADD common function
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);


        //  Remove common function
        arr.remove(2);
        System.out.println(arr);


        //  AddAll common function to add one list item to another list
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(100);
        arr2.add(200);


        //  AddAll common function to add one list item to another list
        arr.addAll(arr2);
        System.out.println(arr);


        //  remove all element from a List means Removing List2 from List
        arr.removeAll(arr2);
        System.out.println(arr);

        arr.add(100);
        System.out.println(arr);

        //  If removing arr2 from arr if in arr2 there is same value(100) as in
        //  arr like here in arr there is 100 also in arr2 there is 100. Then it wil remove the 100
        // from arr too even it was not added through arr2;


        arr.removeAll(arr2);
        System.out.println(arr);

        //  arr.removeAll(arr);
        //  System.out.println(arr);

        //  Size of an array
        System.out.println(arr.size());


        //  Clear The arrList arr
        arr.clear();
        System.out.printf("Removed all elements from arr");
        System.out.printf("\nRemoved____ Now size is : %d\n",arr.size());
    }
}

