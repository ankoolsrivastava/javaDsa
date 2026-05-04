package Array.part3;

public class Sort0_1_2 {
    public static void sorting(int []nums){
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if((nums[i]==1 || nums[i]==2)&&(nums[j]==1 || nums[j]==0)){
                if(nums[i]==2){
                    nums[j]=2;
                    j--;
                }
            }
        }
    }
    static void main(String[] args) {

    }
}
