package basicMaths;

import java.util.Scanner;

public class LCMofNumber {
    static int findGcd(int a,int b){
        //gcd(a,b)=gcd(b,a%b)
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int result=a;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("LCM is 0 As one Number is 0");
            return;
        }
        int gcd=findGcd(a,b);
        int lcm=a/gcd*b;
        System.out.printf("LCM Of %d and %d is: %d ",a,b,lcm);


    }
}
