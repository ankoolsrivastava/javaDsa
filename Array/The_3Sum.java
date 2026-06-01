package Array;

import java.util.*;

class The_3Sum{

    public static List<List<Integer>> threeSum(int[] nums) {

        // Store all valid triplets
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Step 2: Fix one element at a time
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate starting values
            // Example:
            // [-4, -1, -1, 0, 1, 2]
            //       ^
            // If we already processed the first -1,
            // don't process the second -1.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = n - 1;

            // Search for the remaining two numbers
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // -------------------------
                // Triplet Found
                // -------------------------
                if (sum == 0) {

                    result.add(
                            Arrays.asList(
                                    nums[i],
                                    nums[left],
                                    nums[right]
                            )
                    );

                    // Move both pointers
                    left++;
                    right--;

                    // -------------------------
                    // Skip duplicate left values
                    // -------------------------
                    while (left < right &&
                            nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // -------------------------
                    // Skip duplicate right values
                    // -------------------------
                    while (left < right &&
                            nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                // -------------------------
                // Sum is too small
                // Need a bigger number
                // -------------------------
                else if (sum < 0) {
                    left++;
                }

                // -------------------------
                // Sum is too large
                // Need a smaller number
                // -------------------------
                else {
                    right--;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> answer =threeSum(nums);

        System.out.println(answer);
    }
    // ===== MAIN METHOD END =====
}