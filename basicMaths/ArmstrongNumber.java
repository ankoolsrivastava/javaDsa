package basicMaths;
import java.util.Scanner;
public class ArmstrongNumber {

    static void armstrongNumber(int n){
        int num =n;
        String l=String.valueOf(n);
        int len=l.length();
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=(int)Math.pow(rem,len);
            num=num/10;
        }
        if(sum==n){
            System.out.print("Is An Armstrong Number");
        }
        else System.out.print("Is Not An Armstrong Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        armstrongNumber(a);
    }
}
