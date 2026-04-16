package pattern;

public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int m=1;m<i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
