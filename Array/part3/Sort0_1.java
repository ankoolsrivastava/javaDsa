package Array.part3;

public class Sort0_1 {
    public static int[] swap(int [] a){
        int j= (a.length)-1;
        int i=0;
        if(a.length==0) {
            return a;
        }
        while(i<j){
            if(a[i]==1 && a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
           if(a[i]==0){
               i++;
           }
           if(a[j]==1){
               j--;
           }
        }
        return a;

    }
    static void main(String[] args) {
            int []a={1,0,0,0,1,1,1};
            int []arr=swap(a);
            for(int i:arr){
                System.out.print(i);
            }

    }
}
