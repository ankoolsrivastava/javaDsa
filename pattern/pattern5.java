package pattern;

public class pattern5 {
    public static void main(String []Args){
        int n=5;
        int i;
        int j;
        for (i=1;i<=n;i++){
            for (j=(n-i)+1;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
