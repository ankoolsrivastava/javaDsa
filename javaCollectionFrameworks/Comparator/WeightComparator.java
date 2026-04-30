package javaCollectionFrameworks.Comparator;

import java.util.Comparator;

public class WeightComparator implements Comparator<Students>{
    @Override
    public int compare(Students s1, Students s2){
        if(s1.getWeight()==s2.getWeight()){
            return s1.getName().compareTo(s2.getName());
        }
      return Integer.compare(s1.getWeight(),s2.getWeight());
//        return s1.getWeight()-s2.getWeight();
    }
}
