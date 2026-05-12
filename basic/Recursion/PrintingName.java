package basic.Recursion;

public class PrintingName {
    public static void printName(int n){
        if(n==0){
        return;
    }
        System.out.println("ANKOOL");
        n--;
        printName(n);

    }

    static void main(String[] args) {
        int a=5;
        printName(a);
    }
}
