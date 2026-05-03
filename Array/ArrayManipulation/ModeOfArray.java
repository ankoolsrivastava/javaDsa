package Array.ArrayManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ModeOfArray {
    public static int highFreqNo(int []a){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:a){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxkey=-1;
        int maxvalue=-1;

        Set<Map.Entry<Integer,Integer>> entry= freq.entrySet();
        for(Map.Entry<Integer,Integer> b:freq.entrySet()){
            System.out.println(b);
        }
        for(int i:freq.keySet()){
            int key=i;
            if(maxvalue<freq.get(i)){
                maxvalue=freq.get(i);
                maxkey=key;
            }
        }
    return maxkey;
    }

    static void main(String[] args) {
        int a[]={1,2,2,3,3,3,4,4,5,4,4,4,5,5,5,5,5};
       int value= highFreqNo(a);
       System.out.print(value);
    }
}
