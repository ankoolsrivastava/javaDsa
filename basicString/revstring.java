package basicString;

public class revstring {
    static String revstring(String str){
    String rev="";
    int n=str.length();
    for(int i=n-1;i>=0;i--){
        rev=rev+str.charAt(i);
    }
        return rev;
    }

    public static void main(String[] args){
        String s="ankool";

        System.out.print(revstring(s));

    }
}
