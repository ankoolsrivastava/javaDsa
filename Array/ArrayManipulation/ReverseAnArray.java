package Array.ArrayManipulation;

public class ReverseAnArray {
    public static int[] swap(int [] a){
        int len=a.length;
        int i=0;
        int j=len-1;
        while(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            i++;
            j--;
        }
        return a;
    }
    static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        swap(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
