package Array.Beginner;

public class FirstUnsortedElement {
    public static int unsorted(int []a){
           int num;
           for(int i=0;i<a.length-1;i++){
               if(a[i]>a[i+1]){
                   return a[i];
               }
           }
        return -1;
    }

    static void main(String[] args) {
        int[]a={2,4,5,3,7};
        System.out.print(unsorted(a));
    }
}
