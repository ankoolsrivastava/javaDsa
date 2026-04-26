package basicMaths;
import java.util.Scanner;

public class GCDofNumber {
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
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        System.out.printf("Gcd Of %d and %d is: %d ",a,b,findGcd(a,b));


    }
}
