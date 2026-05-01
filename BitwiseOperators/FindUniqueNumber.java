package BitwiseOperators;

public class FindUniqueNumber {
    static void main(String[] args) {
        int [] a={1,2,3,4,2,1,4,7};
        int result=0;
        for(int i=0; i<a.length;i++){
            result=result^a[i];
        }
        System.out.println(result);
    }
}
