package pattern;

public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int count=1;
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for(j=1;j<=i;j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
    }
}
