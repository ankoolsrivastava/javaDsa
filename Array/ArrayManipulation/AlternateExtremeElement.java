package Array.ArrayManipulation;

public class AlternateExtremeElement {
    public static void extremeElement(int []a){
        int i=0;
        int n=a.length;
        int j=n-1;
        while(i<=j){
            if(i==j){
                System.out.print(a[i]+" ");
            }
            else {
                System.out.print(a[i] + " ");
                System.out.print(a[j] + " ");
            }
            i++;
            j--;
        }
    }

    static void main(String[] args) {
        int []a={1,2,3,4,5};
        extremeElement(a);
    }
}
