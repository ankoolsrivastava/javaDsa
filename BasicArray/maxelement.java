package BasicArray;

public class maxelement {
    public static void main(String[] Args){
        int [] a={-20,-33,-4,-1,-3};
        int max=a[0];
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.print("Maximum is "+max);
    }
}
