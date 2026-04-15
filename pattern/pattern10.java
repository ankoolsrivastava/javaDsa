package pattern;

public class pattern10 {
    public static void main(String[] args){
        int n=5;
        int row;
        int clm;
        for (row=1;row<=n;row++){
            for(clm=1;clm<=n-row;clm++){
                System.out.print(" ");
            }
            if(row==1||row==n){
                for(clm=1;clm<=2*row-1;clm++){
                System.out.print("*");
            }}
            else{
                System.out.print("*");
                for(clm=1;clm<=2*row-3;clm++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
