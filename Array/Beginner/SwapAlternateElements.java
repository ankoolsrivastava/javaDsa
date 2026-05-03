package Array.Beginner;

public class SwapAlternateElements {
    public static int[] swaping(int[]a){
        int temp;
        for(int i=0;i<a.length-1;i+=2){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        return a;
    }

    static void main(String[] args) {
        int []a={1,2,3,4,5};
        swaping(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
