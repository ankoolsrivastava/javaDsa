package BasicArray;

public class sumin2d {
    public static void main(String[] Args){
        int [][] a={
                {1,2},
                {2,3},
                {3,4},
                {4,2},
                {5,1}
        };
        int c=0;
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                c = c + a[i][j];
            }
        }
            System.out.println("Sum is: "+c);



}
}
