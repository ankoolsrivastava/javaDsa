package basicMaths;

import java.util.Scanner;

public class ReverseANumber {
    static long reversed(Long num){
        long rev=0;
        while(num!=0){
            long n=num%10;
            rev=rev*10+n;
            num=num/10;
        }
        return rev;
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers:");
        long n=sc.nextLong();
        System.out.println("The reverse is: "+reversed(n));

    }
}
