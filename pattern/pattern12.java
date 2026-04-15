package pattern;

public class pattern12 {
    public static void main(String[] args) {
        int n=4;
        int i;
        int j;
        for(i=1;i<=n;i++){
            //space before
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //after space star
            System.out.print("*");

            for(j=1;j<=2*i-3;j++){
                //after single star space again
                System.out.print(" ");

            }
            //last star at end
            if(i!=1){
            System.out.print("*");
            }
        System.out.println(" ");
        }
        for(i=1;i<=n;i++){
            if(i==1){
                continue;
            }
            for(j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for(j=1;j<=((2*n)-(2*i+1));j++){
                System.out.print(" ");

            }
            if(i!=n){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
