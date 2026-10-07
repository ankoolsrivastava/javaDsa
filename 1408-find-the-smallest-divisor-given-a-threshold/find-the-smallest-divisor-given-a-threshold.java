class Solution {
    public boolean canDo(int [] nums, int mid,int threshold){
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=((num+mid-1)/mid);            
        }
        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int start=    1;
        int end=Integer.MIN_VALUE;
        for(int i:nums){
            end=Math.max(i,end);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(canDo(nums,mid,threshold)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}