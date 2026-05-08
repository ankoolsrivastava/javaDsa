package Array.part4;
public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<=n-1;j++){
                    if((nums[i]+nums[j])==target){
                        int [] ans={i,j};
                        return ans;
                    }
                }
            }
            int [] ans={};
            return ans;
        }

    static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int target=4;
        int [] b=twoSum(a,target);
        for(int c:b){
            System.out.println(c);
        }

    }
}


