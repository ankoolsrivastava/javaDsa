package BitwiseOperators;

import java.util.Scanner;

public class Powerof2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
//        int count=0;
//        while(n!=0) {
//            if ((n & 1) != 0) {
//                count++;
//            }
//            n = n >> 1;
//        }
//        if(count==1){
//            System.out.println("Power of 2");
//        }
//        else{
//            System.out.println("Not Power of 2");
//        }

        if((n&(n-1))==0){
            System.out.println("Power of 2");
        } else {
            System.out.println("Not Power of 2");
        }

    }
}
