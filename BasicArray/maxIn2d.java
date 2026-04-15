package BasicArray;

public class maxIn2d {
    public static void main(String[] Args){
        int [][] a={
                {1,2},
                {6,3}
        };
        int max=a[0][0];
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("Max is "+max);



    }
}
