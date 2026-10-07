class Solution {
    public Boolean canDo(int [] weights,int mid,int days){
        int n=weights.length;
        int day=1;
        int sum=0;
        for(int i:weights){
            if(sum+i>mid){
                day++; 
                sum=i;           
            }else{
                sum+=i;
            }
        }           
    return day<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int left=Integer.MIN_VALUE;
        
        for(int i: weights){
            sum+=i;
            left=Math.max(left,i);
        }
        int right=sum;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canDo(weights,mid,days)){
                result=mid;
                right=mid-1;                
            }else{
                left=mid+1;
            }
        }return result;
    }
}