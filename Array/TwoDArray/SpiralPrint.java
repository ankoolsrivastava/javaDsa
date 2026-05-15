package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {

    static class Solution {

        public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> result = new ArrayList<>();

            int m = matrix.length;
            int n = matrix[0].length;

            int startrow = 0;
            int endrow = m - 1;

            int startcol = 0;
            int endcol = n - 1;

            while(startrow <= endrow && startcol <= endcol) {

                // Left → Right
                for(int col = startcol; col <= endcol; col++) {
                    result.add(matrix[startrow][col]);
                }
                startrow++;

                // Top → Bottom
                for(int row = startrow; row <= endrow; row++) {
                    result.add(matrix[row][endcol]);
                }
                endcol--;

                // Right → Left
                if(startrow <= endrow) {

                    for(int col = endcol; col >= startcol; col--) {
                        result.add(matrix[endrow][col]);
                    }

                    endrow--;
                }

                // Bottom → Top
                if(startcol <= endcol) {

                    for(int row = endrow; row >= startrow; row--) {
                        result.add(matrix[row][startcol]);
                    }

                    startcol++;
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Solution obj = new Solution();

        List<Integer> ans = obj.spiralOrder(matrix);

        System.out.println(ans);
    }
}