package BitwiseOperators;

import java.util.Scanner;

public class CountSetBits {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int count = 0;
        while(n!=0){
            if((n&1)!=0){
             count++;
            }
            n=n>>1;
        }
        System.out.print("Te number of Set Bits: "+count);
    }
}
