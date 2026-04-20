package basicString;

public class StringToUppercase
{

    static String convertUpper(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char)(ch - 32);
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "ankool123";
        System.out.println(convertUpper(s));
    }
}