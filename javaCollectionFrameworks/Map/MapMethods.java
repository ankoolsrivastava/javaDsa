package javaCollectionFrameworks.Map;
// these methods are Same  to all (hashmap, treemap,Linkedhashmap)
// just the difference is their time complexity and order of storing according to order of entry.
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
//         insertion
        map.put(1,"ankool");
        // map.put(1,"ankool2");
        map.put(2,"srivastava");
        map.put(3,"ankit");

        System.out.println(map);

        Map<Integer,String> map2=new HashMap<>();
        map2.put(4,"Pradeep");
        map2.put(5,"srivastava");
        System.out.println("before"+map2);

        map2.putAll(map);
        System.out.println("after"+map2);

//         Deletion
        map2.remove(5);
        System.out.println(map2);
        System.out.println(map2.size());
        // map2.clear();
        // System.out.println(map2.size());

//     Insert if not present
        map2.putIfAbsent(1,"an");
        System.out.println(map2);

        map2.putIfAbsent(8,"an");
        System.out.println(map2);

//         To get the corresponding value like i want to check corresponding value of 1 which is ankool;
        System.out.println(map2.get(1));
//         to get and if not found retunr default value
        System.out.println(map2.getOrDefault(1,"lol nhi u hai"));
        System.out.println(map2.getOrDefault(0,"lol nhi  hai"));

//         to check if the key present or not returns boolean
        System.out.println(map2.containsKey(1));

//         to check if the Value present or not returns boolean
        System.out.println(map2.containsValue("ankool"));

//         replace the key value with new
        map2.replace(8,"Replaced value of key 8");
        System.out.println(map2);
//                      replace the value of key only if that value is associated wiht it;
        map2.replace(3,"Amit","Ankit(repalced one)");
        System.out.println(map2);
        map2.replace(3,"ankit","Ankit(repalced one)");
        System.out.println(map2);

//         remove from entry
        map2.remove(8);
        System.out.println("removed the entry "+map2);
//         remove from entry only if key assoiciated to that value
        map2.remove(2,"sr");
        System.out.println("Unable to remove as value is different with that key: "+map2);
        map2.remove(2,"srivastava");
        System.out.println("removed Srivastva: "+map2);


//         return all key in map
        Set<Integer>  keyset=map2.keySet();
        System.out.println("All key Set: "+keyset);

//         return all value from map
        Collection<String> valueset=map2.values();
        System.out.println("All Values: "+valueset);

// returns all key value from map in this method sit store all it so we can later use it for iteration of other thing

//        map2.entrySet() returns a value
//        Type: Set<Map.Entry<Integer, String>>
//        st is a variable of the same type
//        So it can hold that returned value.


        Set<Map.Entry<Integer, String>> st = map2.entrySet();
        System.out.println("All key Value option 1: "+st);
//        option 2
        System.out.println("All key Value: "+map2.entrySet());

//         iterating over a map

        for(Map.Entry<Integer,String> mapiterator:st)
            System.out.println("Key: " + mapiterator.getKey() +" "+ "Values: " + mapiterator.getValue());

    }

}