package basicString;

public class RemoveAllSpaces {
   static String remove(String s){
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
            str+=ch;
            }
        }
        return str;
    }

    static void main(String[] args) {
        String str="   Anko ol";
        System.out.println(remove(str));
    }
    /*static void main(String[] args) {
    String str="   Anko ol";
    System.out.println(str);
}*/
}
