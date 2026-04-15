package BasicArray;

public class multiall {
    public static void main(String[] Args){
        int [] a={1,2,3,4,5};
        int mul=1;
        int n=a.length;
        for(int i=1;i<=n;i++){
            mul=mul*i;
        }
        System.out.print("Multiplication is "+mul);
    }
}
