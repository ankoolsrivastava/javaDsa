package javaCollection.List;
import java.util.ArrayList;
import java.util.List;

//  Methods Include:
//      get()
//      set()
//      toArray()
//      contains

public class ListMethods {
    static void main(String[] args) {
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(10);
        arr2.add(20);
        arr2.add(30);
        arr2.add(40);
        arr2.add(50);
        arr2.add(60);

//        To get the Element
        System.out.println("Got the element you asked for: "+arr2.get(2));



//        Down here arr2.set() Method return the Old value like here in this case The Old Value Was 30
//        System.out.println("After Change"+arr2.set(2,300)); In THis CAse iw went print this it will print 30 we can store it too
//            int old=arr2.set(2,300);
//            System.out.println(old);------>30




//        To Change the Element
        System.out.println("Before Change"+arr2);
        arr2.set(2,300);
        System.out.println("After Change"+arr2);



//        To Change any to ----> Array .  like if the collection is of any type like ArrayList, Vector, Stack, LinkedList,,etc.....; we Use .toArray()

         Object[] arr=arr2.toArray();
         for(Object obj:arr2){
             System.out.println(obj);
         }


//      Check if element Present or Not In list returns True or False
        System.out.println(arr2.contains(100));
        System.out.println(arr2.contains(10));
    }
}

