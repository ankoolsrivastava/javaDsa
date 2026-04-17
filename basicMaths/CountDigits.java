package basicMaths;

import java.util.Scanner;

public class CountDigits {
    static int Count(Long num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  number:");
        long n=sc.nextLong();
        System.out.println(Count(n));

    }
}
