package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class Transpose {
    public static List<Integer> transpose(int [][] nums){
        List<Integer> result=new ArrayList<>();
        int m= nums.length;
        int n=nums[0].length;
        int [][] newArray=new int[n][m];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                newArray[j][i] = nums[i][j];
            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    result.add(newArray[i][j]);
                }
            }
        return result;
    }
    static void main(String[] args) {
        int [][]a={{1,2,3},{2,3,4},{5,6,7}};
        System.out.print(transpose(a));

    }
}
