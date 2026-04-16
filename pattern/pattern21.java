package pattern;

public class pattern21 {
    public static void main(String[] args) {
        int n=4;
        int i;
        int j;
        for(i = 1; i <= n; i++){

            for(j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for(j = 0; j < i; j++){
                System.out.print((char)(j + 'A') + " ");
            }

            for(j = 0; j < i - 1; j++){
                System.out.print((char)('A' + (i - j - 2)) + " ");
            }

            System.out.println();

        }

    }
}
