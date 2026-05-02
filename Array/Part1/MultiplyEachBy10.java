package Array.Part1;

public class MultiplyEachBy10 {
    public static int[] multi(int[]a){
        int len=a.length;
        int [] b= new int [len];
        for(int i=0;i<len;i++){         // O(n)
            int element=a[i];           // O(1)
            int newElement=element*10;  // O(1)
            b[i]=newElement;            // O(1)
        }
        return b;

    }

    static void main(String[] args) {
        int[] a={99,100};
        int[] newarr=multi(a);
        for(int i:newarr){
            System.out.print(i+" ");
        }


    }
}
