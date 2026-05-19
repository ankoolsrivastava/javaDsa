package BinarySearch;
class PeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        int start = 0;
        int end = n - 1;
        while(start < end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] >= nums[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }
    static void main(String[] args) {
        int nums[]={10,20,30,40,50};
        System.out.println(findPeakElement(nums));
    }
}