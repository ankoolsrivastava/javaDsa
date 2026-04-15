package BasicArray;

public class minIn2d {
    public static void main(String[] Args){
        int [][] a={
                {-9,2},
                {6,-10}
        };
        int min=a[0][0];
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]<min){
                    min=a[i][j];
                }
            }
        }
        System.out.println("Max is "+min);



    }
}
