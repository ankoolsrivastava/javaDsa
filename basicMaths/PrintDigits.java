package basicMaths;
import java.util.*;

public class PrintDigits {
    static void PrintSingle(int num){
        while(num!=0){
            int s=num%10;
            System.out.println(s);
            num=num/10;
        }
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  number:");
        int n=sc.nextInt();
        PrintSingle(n);

    }
}
