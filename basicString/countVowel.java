package basicString;

public class countVowel {
    static int vowelCount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
                count++;
            }

        }
        return count;
    }
    static void main() {
    String st="ANKool";
    String str=st.toLowerCase();
    System.out.println(vowelCount(str));
    }
}
