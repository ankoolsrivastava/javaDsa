package pattern;

public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                int numvalue=n-j+'A';
                char finalans=(char)numvalue;
                System.out.print(finalans+" ");
            }
            System.out.println();
        }
    }
}
