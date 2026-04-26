package basicMaths;
import java.util.Scanner;

public class CheckPerfectNumber2 {

    static void perfectNumber(int n) {
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {


                if (i != n) {
                    sum += i;
                    System.out.println("Divisible by " + i);
                }

                int pair = n / i;
                if (pair != i && pair != n) {
                    sum += pair;
                    System.out.println("Divisible by " + pair);
                }
            }
        }

        if (sum == n) {
            System.out.println("It is a Perfect number");
        } else if (sum > n) {
            System.out.println("It is an Abundant number");
        } else {
            System.out.println("It is a Deficient number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int a = sc.nextInt();

        perfectNumber(a);
    }
}