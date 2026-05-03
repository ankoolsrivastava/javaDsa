package Array.ArrayManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighOrLowFreq {

    public static void highOrLow(int [] a){
        int []b=new int[2];
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:a){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        Set<Map.Entry<Integer,Integer>> entry= freq.entrySet();
        for(Map.Entry<Integer,Integer> m:freq.entrySet()){
            System.out.println(m+ " ");
        }
        int maxFreq=Integer.MIN_VALUE;
        int minFreq=Integer.MAX_VALUE;
        int maxKey=-1;
        int minKey=-1;
        for(int k:freq.keySet()){
            int key=k;
            if(maxFreq<freq.get(k)){
                maxFreq=freq.get(k);
                maxKey=key;
            }


            if(minFreq>freq.get(k)){
                minFreq=freq.get(k);
                minKey=key;
            }


        }
        b[0]=maxKey;
        b[1]=minKey;
        System.out.println("Minimum value Key: "+b[1]+" ");
        System.out.println("Maximum Value Key: "+b[0]+" ");

    }

    static void main(String[] args) {
        int a[]={1,2,2,3,3,3,4,4,5,4,4,4,5,5,5,5,5};
        highOrLow(a);
        }
    }

