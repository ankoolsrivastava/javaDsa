package BasicArray;

public class SymmetricMatrix {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rowlen = a.length;
        int cmllen = a[0].length;

        boolean isSymmetric = true;

        for (int i = 0; i < rowlen; i++) {
            for (int j = i + 1; j < cmllen; j++) {
                if (a[i][j] != a[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is NOT Symmetric");
    }}