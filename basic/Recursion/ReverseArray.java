package basic.Recursion;

import java.util.Arrays;

public class ReverseArray {
    public  static void rev(int []a,int left,int right){

        if(left>=right){
            return;
        }
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            rev(a,left+1,right-1) ;
    }

    static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        rev(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
