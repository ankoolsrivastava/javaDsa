package javaCollectionFrameworks.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class usingComparable {
    public static void main(String[] args) {
        List<Students> st=new ArrayList<>();
        st.add(new Students(11,"B",95));
        st.add(new Students(34,"A",95));
        st.add(new Students(5,"a",95));
        Collections.sort(st);
        System.out.print("list"+st);
    }

}






