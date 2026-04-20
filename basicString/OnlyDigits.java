package basicString;
public class OnlyDigits {

    static boolean isOnlyDigits(String str) {
        if (str.length() == 0) return false; // optional

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isOnlyDigits("12345")); // true
        System.out.println(isOnlyDigits("12a45")); // false
    }
}