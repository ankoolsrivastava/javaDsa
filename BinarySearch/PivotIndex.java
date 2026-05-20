package BinarySearch;

public class PivotIndex {
    public static int pivot(int [] nums){
        int n= nums.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        if(nums[start]<nums[end]){
            return -1;
        }
        else{
            while(start<=end){
                int mid=start+((end-start)/2);
                if(nums[mid]<=nums[n-1]){
                    end=mid-1;
                }
                else{
                    ans=mid;
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
