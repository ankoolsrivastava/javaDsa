package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SumOfClm {
    public static List<Integer> sum(int [][] nums){
        List<Integer> result=new ArrayList<>();
        int m=nums.length;
        int n= nums[0].length;
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<m;i++){
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
