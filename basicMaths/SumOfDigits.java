package basicMaths;

import java.util.Scanner;

public class SumOfDigits {
    static long Sum(long num){
        long sum=0;
        while(num!=0){
            long n=num%10;
            sum=sum+n;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  number:");
        long n=sc.nextLong();
        System.out.println("Sum is: "+Sum(n));
    }
}
