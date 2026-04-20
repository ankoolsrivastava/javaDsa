package basicString;

public class frequency {
    static void countfrequency(String s,char a){
        char[] arr=s.toCharArray();
        int count=0;
        for (int i=0;i<arr.length;i++){
        char ch=arr[i];
        if(ch==a){
            count ++;
        }
        }
        System.out.println(count);
    }

    static void main(String[] args) {
        String str="ankooool";
        char c='o';
        countfrequency(str,c);
    }
}
