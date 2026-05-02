package Array.Part1;



public class ExtremeAlternate {
    public static void printExtreme(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            if (start == end) {
                System.out.print(a[start] + " ");
            } else {
                System.out.print(a[start] + " ");
                System.out.print(a[end] + " ");
            }
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        printExtreme(a);
    }
}
