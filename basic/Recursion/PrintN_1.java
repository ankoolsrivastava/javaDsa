package basic.Recursion;

public class PrintN_1 {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void main(String[] args) {
        int a=5;
        print(a);
    }
}
