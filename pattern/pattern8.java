package pattern;

public class pattern8 {
    public static void main(String[] args){
        int n=4;
        int row;
        int clm;
        for(row=1;row<=4;row++){
            for(clm=1;clm<=6;clm++){
             if(row==1||row==4){
                 System.out.print("* ");
             }
             else{
            if(clm==1 || clm==6){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
         }
    }System.out.println();
    }
}
}