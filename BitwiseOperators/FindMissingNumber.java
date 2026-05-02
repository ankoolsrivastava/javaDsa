package BitwiseOperators;

public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }

        return xor ^ n;
    }

    static void main(String[] args) {
        int []a={0,1,2,3,4,6,7};
        System.out.println(missingNumber(a));
    }
}