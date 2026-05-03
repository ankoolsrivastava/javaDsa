package Array.Beginner;

public class CountNoOf0_and_1 {
    public static int[] countingNumber(int[]a){
        int countOfZero=0;
        int countOfOne=0;
        for(int n: a){
            if(n==0){
                countOfZero++;
            } else if (n==1) {
                countOfOne++;
            }

        }
        int b[]={countOfZero,countOfOne};
        return b;
    }

    static void main(String[] args) {
        int []a={1,1,0,7,0};
        int b[]=countingNumber(a);
        System.out.println("O's Count are:  "+b[0]);
        System.out.println("O's Count are:  "+b[1]);
    }
}
