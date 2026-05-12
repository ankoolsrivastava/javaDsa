package Array.TwoDArray;

import java.util.List;
import java.util.ArrayList;
public class SumOfRows {
    public static List<Integer> sum(int [][] nums){
        List<Integer> result=new ArrayList<>();
        int m=nums.length;
        int n= nums[0].length;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=nums[i][j];
            }
            result.add(sum);
        }
        return result;
    }

    static void main(String[] args) {
        int [][]a={{1,2,3},{2,3,4},{5,6,7}};
            System.out.print(sum(a));
    }

}
