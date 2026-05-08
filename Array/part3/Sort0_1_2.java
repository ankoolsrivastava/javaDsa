package Array.part3;

public class Sort0_1_2 {
    public static void sorting(int []nums){
        int n=nums.length;
        int zero=0;
        int one=0;
        int two=0;
        for(int i:nums){
            if(i==0){
                zero++;

            } else if (i==1) {
                one++;
            }
            else {
                two++;
            }
        }
        for (int i=0;i<zero;i++){
            nums[i]=0;
        }
        for (int i=zero;i<(zero+one);i++){
            nums[i]=1;
        }
        for (int i=zero+one;i<=n-1;i++){
            nums[i]=2;
        }
        for(int j:nums){
            System.out.print(j+" ");
        }

    }
    static void main(String[] args) {
            int a[]={1,2,0,1,0,1,1,2,0,0,1,2,1,1,0};
            sorting(a);
    }
}
