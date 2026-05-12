package basic.Recursion;

public class Backtracking_1_N {
    static void print(int i,int n){
        if(i<1){
            return;
        }
        print(i-1,n);
        System.out.println(i);
    }
    static void main(String[] args) {
        int a=5;
        int i=5;
        print(i,a);
    }
}
