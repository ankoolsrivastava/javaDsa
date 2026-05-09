package Array.part4;

import java.util.HashMap;

public class TwoSum_HashSet {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};

    }

    static void main(String[] args) {
        int[]a ={1,2,3,4,5};
        int target=6;
        int result[]=twoSum(a,target);
        for(int i:result){
            System.out.print(" "+i+" ");
        }
    }
}