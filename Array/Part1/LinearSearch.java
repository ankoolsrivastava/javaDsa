package Array.Part1;

public class LinearSearch {
    public static boolean search(int []a,int n){
        for(int i:a){
            if(n==i) {
                return true;
            }
        }
        return false;
    }

    static void main(String[] args) {
        int []a={1,2,3,4};
        int n=9;
        System.out.println(search(a,n));
    }
}
