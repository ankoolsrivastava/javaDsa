package Array;

public class pow_x_n {
    public static double pow(double x,int n){
        long expo=n;
        if(n<0){
            x=1/x;
            expo=-expo;
        }
        double ans=1.0;
        while(expo>0){
            if(expo%2==1){
                ans*=x;
            }
            x*=x;
            expo/=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 10));   // 1024.0
        System.out.println(pow(2, -3));   // 0.125
        System.out.println(pow(5, 0));    // 1.0
        System.out.println(pow(2.5, 3));  // 15.625
    }
}
