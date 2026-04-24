package basicMaths;
import java.util.Scanner;
public class CheckPrime {
    static void checkPrime(int n){
        int num=n;
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.println("The Number Is Prime. ");
        }
        else {
            System.out.println("NOt Prime");
            }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        checkPrime(num);
    }
}
