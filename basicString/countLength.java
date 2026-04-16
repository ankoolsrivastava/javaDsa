package basicString;

public class countLength {
    static int countLengthWithoutLength(String str){
        int count=0;
        char[] arr=str.toCharArray();
        for(char ch:arr){
            count++;
        }
        return count;
    }
     static void main() {
        String st="Akool";
        System.out.println(countLengthWithoutLength(st));

    }
}
