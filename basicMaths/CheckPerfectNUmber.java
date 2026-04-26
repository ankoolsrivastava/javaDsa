package basicMaths;

import java.util.Scanner;

public class CheckPerfectNUmber {
    static void perfectnumber(int n){
        int num=n;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println("Divisible by "+i);
                sum+=i;

            }
        }
        if(sum==num){
            System.out.print("It is a Perfect number");
        } else if (sum>num) {
            System.out.print("It is an Abundant number”");
        } else if (sum<num) {
            System.out.print("It is a Deficient number");
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        perfectnumber(a);

    }
}
