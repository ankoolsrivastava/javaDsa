package pattern;
public class pattern9 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                System.out.println("*");
            }
            else if (i == 2) {
                System.out.println("**");
            }
            else if (i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                System.out.print("*");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}