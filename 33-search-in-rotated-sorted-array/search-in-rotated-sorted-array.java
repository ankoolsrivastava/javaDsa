class Solution {
    static int pivotIndex(int []nums){
        int n=nums.length;
        int s=0;
        int e=n-1;
        int ans=0;
        if(nums[s]<=nums[e]){
            return -1;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<=nums[n-1]){
                e=mid-1;
            }else{
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
    static int binarySearch(int[] nums,int s,int e,int target){
        int n=nums.length;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=pivotIndex(nums);
        int n=nums.length;
        if(pivot==-1){
            int ans=binarySearch(nums,0,n-1,target);
            return ans;
        }{
            int leftst=0;
            int leftend=pivot;
            if(target>=nums[leftst] && target<=nums[leftend]){
                int ans=binarySearch(nums,leftst,leftend,target);
                return ans;
            }
            int rightst=pivot+1;
            int rightend=n-1;
            if(target<=nums[rightend]){
                int ans=binarySearch(nums,rightst,rightend,target);
                return ans;
            }
        }return -1;
    }
}