package Array;

public class KadaneAlgorithm {
    public static int maxSumSubarray(int[] nums){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }

    static void main(String[] args) {
        int [] a={5,4,-1,7,8};
        System.out.print(maxSumSubarray(a));

    }
}
