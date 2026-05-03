package Array.ArrayManipulation;

public class ShiftElementBy1 {
    public static void shiftingBy1ToRight(int []a){
        int n=a.length;
//                   -> temp    || going form last to first storing last element to temp
//         1 2 3 4 5 6 --> 6 1 2 3 4 5

        int temp=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;


    }

    static void main(String[] args) {
        int [] a={1,2,3,4,5};
        shiftingBy1ToRight(a);
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
