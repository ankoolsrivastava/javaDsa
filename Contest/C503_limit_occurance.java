package Contest;

import java.util.Arrays;

public class C503_limit_occurance {

    public static int[] limit(int[] nums, int k) {
        int n = nums.length;

        if (n <= k) {
            return nums;
        }

        int i = k;

        for (int j = k; j < n; j++) {
            if (nums[j] != nums[i - k]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return Arrays.copyOf(nums, i);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 3};
        int k = 2;

        int[] result = limit(nums, k);
        System.out.println("Limited array: " + Arrays.toString(result));
    }
}