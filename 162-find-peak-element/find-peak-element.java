class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        int s=0;
        int e=n-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]<=nums[mid+1]){
                s=mid+1;
            }else{
                
                e=mid;
            }
        }
        return s;
    }
}
