package basicString;

public class CountWords {

    static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "  an   kool is  here ";
        System.out.println(countWords(s));
    }
}