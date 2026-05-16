package BinarySearch;

public class BinarySearchImplementation {

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] == target) {
                return mid;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result =search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}