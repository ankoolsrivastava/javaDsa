package BitwiseOperators;

import java.util.Scanner;

public class practice {
    static void main(String[] args) {
        System.out.println(3<<2);
        System.out.println(16>>2);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        if ((n & 1) == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }

    }
}
