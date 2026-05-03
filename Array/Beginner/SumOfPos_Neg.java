package Array.Beginner;

public class SumOfPos_Neg {
    public static int[] posNeg(int[]a){
        int positve=0;
        int negative=0;
        for(int n: a){
            if(n<0){
                negative+=n;
            }
            else {
                positve+=n;
            }
        }
        int b[]={negative,positve};
        return b;
    }

    static void main(String[] args) {
        int []a={1,-2,4,-7,5};
        int b[]=posNeg(a);
        System.out.println("Negative Sum is: "+b[0]);
        System.out.println("positive Sum is: "+b[1]);
    }
}
