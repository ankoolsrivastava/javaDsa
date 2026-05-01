package BitwiseOperators;

import java.util.Scanner;

public class Swap2Numbers {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a= "+a+"b= "+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a= "+a+"b= "+b);

    }
}
