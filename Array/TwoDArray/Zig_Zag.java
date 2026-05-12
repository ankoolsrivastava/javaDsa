package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class Zig_Zag {
    public static List<Integer> sum(int [][] nums){
        List<Integer> result=new ArrayList<>();
        int m=nums.length;
        int n= nums[0].length;
        for(int j=0;j<n;j++){
            if((j & 1)==1)
                {
                    for (int i = (m - 1); i >= 0; i--) {
                        result.add(nums[i][j]);
                    }
                }else{
                for(int i=0;i<m;i++){
                    result.add(nums[i][j]);
                }
            }

        }
        return result;
}
    static void main(String[] args) {
        int [][]a={{1,2,3},{2,3,4},{5,6,7}};
        System.out.print(sum(a));
    }
}
