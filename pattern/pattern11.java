package pattern;

public class pattern11 {
    public static void main(String[] args){
        int n=4;
        int i;
        int j;
        for (i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for (i=1;i<=n;i++){
            if(i==1){
                continue;
            }
            for(j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(j=1;j<=2*n-2*i+1;j++){
                        System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
