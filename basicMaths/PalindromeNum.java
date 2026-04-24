package basicMaths;
import java.util.Scanner;
public class PalindromeNum {
        static  void checkPalindrome(int num){
        int n=num;
        int rev=0;
        while(n!=0){
            int a=n%10;
            rev=rev*10+a;
            n/=10;
        }
        if(rev==num){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        checkPalindrome(num);
    }
}
