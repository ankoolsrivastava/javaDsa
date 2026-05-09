package Array.part4;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        // Mark existing numbers
        for(int i = 0; i < n; i++) {

            int number = Math.abs(nums[i]);

            int position = number - 1;

            if(nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // Find missing numbers
        for(int i = 0; i < n; i++) {

            if(nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        FindAllNumbersDisappearedInAnArray obj =
                new FindAllNumbersDisappearedInAnArray();

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> result = obj.findDisappearedNumbers(nums);

        System.out.println("Missing Numbers:");

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}