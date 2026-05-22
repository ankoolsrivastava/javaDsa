package BinarySearch.OnAnswer;

public class FindSquareRoot {
    public static double mySqrt(int x) {
            int start=1;
            int end=x;
            double ans=0;
            if(x==0) return 0;

            while(start<=end){
                int mid=start+((end-start)/2);
                if(mid == x/mid) return mid;
                else if(mid>x/mid){
                    end=mid-1;

                }
                else{
                    ans=mid;
                    start=mid+1;
                }
            }
            double factor=1;
            int precision=3;
            for(int round=1;round<=precision;round++){
                factor/=10;
                for(int i=1;i<10;i++){
                    double newAns=ans+factor;
                    if(newAns<=x/newAns){
                        ans=newAns;
                    }
                    else{
                        break;
                    }
                }
            }
            return ans;
        }

    static void main(String[] args) {
        System.out.printf("%.3f",mySqrt(56));

    }
}
