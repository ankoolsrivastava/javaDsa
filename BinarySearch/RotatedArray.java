package BinarySearch;

public class RotatedArray {
    public static int SearchInRotate(int[] nums, int target){
        int n=nums.length;
        int start=0;
        int end=PivotIndex.pivot(nums);
        int start2=end+1;
        int end2=n-1;
        int ans=-1;
        if(end == -1){
            return binarySearch(nums,0,n-1,target);
        }
        if(target<=nums[end2] && target>=nums[start2]){
            return ans=binarySearch(nums,start2,end2,target);
        }
        if(target>=nums[start] && target<=nums[end]){
            return ans=binarySearch(nums,start,end,target);
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int start, int end, int target){

                while(start<=end){
                    int mid=start+((end-start)/2);
                    if(nums[mid]==target){
                        return mid;
                    }
                    else if(target>nums[mid]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
                return -1;
    }

    static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(SearchInRotate(arr,0)); // 4
        System.out.println(SearchInRotate(arr,6)); // 2
        System.out.println(SearchInRotate(arr,3)); // -1
    }

}
