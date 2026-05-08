package Array.part4;

public class reaarrageAlternativePosNeg {
    public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] result=new int[n];
        int pos=0;
        int neg=1;
        for(int i:nums){
            if(i>0){
                result[pos]=i;
                pos+=2;
            }
            else{
                result[neg]=i;
                neg+=2;
            }
        }
        return result;
    }

    static void main(String[] args) {
        int a[]={1,2,3,-4,5,-6,-7};
        int c[]=rearrangeArray(a);
        for(int i:c){
            System.out.print(i+" ");
        }
    }
}