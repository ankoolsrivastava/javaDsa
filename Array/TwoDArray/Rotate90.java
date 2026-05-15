package Array.TwoDArray;

public class Rotate90 {

    // Function to rotate matrix 90 degree clockwise
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose the matrix
        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++) {

            int start = 0;
            int end = n - 1;

            while(start < end) {

                int temp2 = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp2;

                start++;
                end--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Rotate90 obj = new Rotate90();

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        obj.rotate(matrix);

        System.out.println("\nRotated Matrix (90 Degree Clockwise):");
        printMatrix(matrix);
    }
}