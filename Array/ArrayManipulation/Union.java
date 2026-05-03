package Array.ArrayManipulation;

import java.util.LinkedHashSet;

public class Union {
    public static void unionOfTwoArray(int []a,int []b){
        LinkedHashSet<Integer> uni= new LinkedHashSet<>();
        for(int i:a){
            uni.add(i);
        }
        for(int j:b){
            uni.add(j);
        }

        System.out.print(uni+" ");
    }
    static void main(String[] args) {
        int []a={1,7,3,4,5};
        int[] b={3,4,5};
        unionOfTwoArray(a,b);
    }
}
