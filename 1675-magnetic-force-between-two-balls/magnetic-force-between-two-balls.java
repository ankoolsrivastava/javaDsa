class Solution {
    public static boolean isValid(int [] position,int m,int mid){
        int ball=1;
        int lastPosition=0;
        for(int i=1;i<position.length;i++){
            if(position[i]-position[lastPosition]>=mid){
                ball+=1;
                lastPosition=i;
                if(ball==m){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int ans=-1;
        int start=0;
        int end=position[n-1]-position[start];
        while(start<=end){
            int mid=start+((end-start)/2);
            if(isValid(position,m,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}