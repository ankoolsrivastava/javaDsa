package Array.part4;

public class Move0ToEnd {
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int b=0;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[b];
                nums[b]=temp;
                b++;
            }

        }
        for(int d:nums){
            System.out.print(d+" ");
        }

    }

    static void main(String[] args) {
        int a[]={1,2,3,0,9,7,0,1,2,3,4,0,0,0,5,6,0};
        moveZeroes(a);
    }

}
