package basicString;
import java.util.Scanner;
public class checkpalindrome {
    static String revstring(String str){
        String rev="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase(revstring(s))){
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }
}
