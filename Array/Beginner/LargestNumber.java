package Array.Beginner;

public class LargestNumber {
    public static int largest(int[] arr) {
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    static void main(String[] args) {
        int [] a={10,77,3,20,45};
        System.out.println(largest(a));
    }
}
