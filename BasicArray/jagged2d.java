package BasicArray;

public class jagged2d {
    public static void main(String[] Args){
        int [][] a={
                {1,2},
                {2,3,4,5},
                {3,4,5,7},
                {4,2},
                {5,1,2,3,4}
        };
        int rowlenght=a.length;
        //int clmlenght=a[0].length
        for(int i=0;i<rowlenght;i++){
            int clmlenght=a[i].length;
            for(int j=0;j<clmlenght;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

}
}
