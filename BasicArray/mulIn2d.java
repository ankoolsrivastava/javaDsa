package BasicArray;

public class mulIn2d {
    public static void main(String[] Args){
        int [][] a={
                {1,2},
                {2,3}
        };
        int c=1;
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                c = c * a[i][j];
            }
        }
        System.out.println("Multiplication is: "+c);



    }
}
