package Array.ArrayManipulation.ShiftingArrayByK;

public class Method1 {
    public static void shifting(int[] a, int k) {


// ----------------------------------------------------------------------------
//        NON OPTIMAL AS IT TAKES O(NxN) time compelxity
// ----------------------------------------------------------------------------
        int n = a.length;
        k = k % n;
        while (k != 0) {
            int temp = a[n - 1];
            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
            k--;
        }
    }

    static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k=2;
        shifting(a,k);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
