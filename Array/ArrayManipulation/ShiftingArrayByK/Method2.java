package Array.ArrayManipulation.ShiftingArrayByK;
//      1 2 3 4 5 6 7
// step:1 -> reverse the array(whole) --> 7 6 5 4 3 2 1
// step:2 -> reverse the array from 0th to k-1 (7 6 5) --> 5 6 7 4 3 2 1
// step 3 -> reverse the element from k to n-1 (4 3 2 1) ---> 5 6 7 1 2 3 4

public class Method2 {
    public static void reverse(int[]a,int start, int end){
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void rightRotate(int a[], int k){
        if (a == null || a.length == 0) return;
        int n=a.length;
        k=k%n;
        if(k==0) return;
        reverse(a,0,n-1);
        reverse( a,0,k-1);
        reverse(a,k,n-1);
}

    static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        rightRotate(a,k);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
