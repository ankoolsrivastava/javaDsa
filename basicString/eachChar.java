package basicString;

public class eachChar {
    static void  stringChar(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            System.out.println(str.charAt(i));
        }
    }
    static void main() {
        String str="Srivastava";
        stringChar(str);
        String s="Ankool";
        char [] chrr=s.toCharArray();
        for(char c:chrr){
            System.out.println(c);
        }

        System.out.println("");
    }
}
