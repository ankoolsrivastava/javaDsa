package BasicArray;

public class minelement {
    public static void main(String[] Args){
        int [] a={-20,-33,-4,-1,-3};
        int min=a[0];
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print("Maximum is "+min);
    }
}
