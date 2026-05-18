package BinarySearch;

public class LowerUpperBound {
    public static int lower(int [] nums, int target){
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end){
            int mid= start+((end-start)/2);
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return ans;
    }
    public static int upper(int[]nums, int target){
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end){
           int mid=start+((end-start)/2);
           if(nums[mid]<=target){
               start=mid+1;
           }
           else{
               ans=mid;
               end=mid-1;

           }
        }
        return ans;
    }

    static void main(String[] args) {
        int nums[]={10,20,20,20,20,20,30,40,50};
        int target=20;
        int low=lower(nums,target);
        int high=upper(nums,target);
        System.out.println("Lower Bound: "+lower(nums,target));
        System.out.println("Upper Bound: "+upper(nums,target));
        System.out.println("Number of  Occurance: "+(high-low));

    }
}
