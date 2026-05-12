package basic.Recursion;

public class Print1To4 {
    static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1,n);
    }
    static void main(String[] args) {
        int a=5;
        int i=1;
        print(i,a);
    }
}
