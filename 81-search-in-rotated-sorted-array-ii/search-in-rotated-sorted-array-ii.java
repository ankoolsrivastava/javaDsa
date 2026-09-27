class Solution {
    static int pivotIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        if (nums[s] < nums[e]) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > s && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
                if (s < e && nums[s] > nums[s + 1]) return s;
                s++;
                if (e > s && nums[e - 1] > nums[e]) return e - 1;
                e--;
            }
            else if (nums[s] < nums[mid] || (nums[s] == nums[mid] && nums[mid] > nums[e])) {
                s = mid + 1; 
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
    static boolean binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return true; 
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return false;
        int pivot = pivotIndex(nums);
        if (pivot == -1) {
            return binarySearch(nums, 0, n - 1, target);
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot, target);
        } else {
            return binarySearch(nums, pivot + 1, n - 1, target);
        }
    }
}