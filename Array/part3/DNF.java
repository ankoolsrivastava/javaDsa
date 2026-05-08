package Array.part3;

public class DNF {

    public static void sort(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {

                mid++;
            }

            else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,0,2,1,1,0};

        sort(arr);
    }
}