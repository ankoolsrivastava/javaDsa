package basic.Recursion;

public class CheckPalindromeString {
    public static boolean palindromeCheck(String s,int i){
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }

       return palindromeCheck(s,i+1);

    }

    static void main(String[] args) {
        String s="ankooLookna";
        System.out.print(palindromeCheck(s,0));
    }
}
