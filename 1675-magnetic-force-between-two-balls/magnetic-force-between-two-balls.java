class Solution {
    static boolean possibleToPlace(int [] position, int mid,int m) {
        int n=position.length;
        int prev=position[0];
        int countBalls=1;
        for(int i=1;i<n;i++){
            int next=position[i];
            if(next-prev>=mid){
                countBalls++;
                prev=next;
            }
            if(countBalls==m){
                break;
            }
        }
        return countBalls==m;
    }

    public int maxDistance(int[] position, int m) {
        int n=position.length;
        int ans=-1;
        int minForce=1;
        Arrays.sort(position);
        int maxForce=position[n-1]-position[0];
        while(minForce<=maxForce){
            int midForce=minForce+(maxForce-minForce)/2;
            if(possibleToPlace(position,midForce,m)){
                ans=midForce;
                minForce=midForce+1;
            }else{
                maxForce=midForce-1;
            }
        }
        return ans;
    }
}