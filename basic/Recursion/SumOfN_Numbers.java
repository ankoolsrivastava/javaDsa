package basic.Recursion;

public class SumOfN_Numbers {
    public static void sum(int n,int sum){
        if(n==0){
            System.out.print(sum+" ");
            return;
        }
        sum+=n;
        sum(n-1,sum);

    }

    static void main(String[] args) {
        int n=5;
        int sum=0;
        sum(n,sum);
    }
}
