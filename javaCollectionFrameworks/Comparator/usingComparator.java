package javaCollectionFrameworks.Comparator;


import java.util.*;

public class usingComparator  {
    public static void main(String[] args) {
        List<Students> st = new ArrayList<>();
        st.add(new Students(11, "b", 95));
        st.add(new Students(34, "A", 95));
        st.add(new Students(5, "a", 95));

//        Mehotd 1


        Collections.sort(st, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.print("list" + st);


//        Method 2 Lambda expression


        Collections.sort(st,(s1,s2) -> s1.getWeight()-s2.getWeight());
        System.out.print("list" + st);

//        Method 3


        Collections.sort(st,new WeightComparator());
        System.out.println(st);
    }


}
