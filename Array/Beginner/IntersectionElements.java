package Array.Beginner;

public class IntersectionElements {
    public static void commonElement(int []a,int[]b) {

        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }

    static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,3,7};
        commonElement(a,b);

    }
}
