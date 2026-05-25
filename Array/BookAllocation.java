package Array;


import java.util.*;

public class BookAllocation {

    // checks if allocation is possible
    static boolean isPossible(int[] arr, int n, int m, int maxPages) {

        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < n; i++) {

            // current student can take this book
            if (pages + arr[i] <= maxPages) {

                pages += arr[i];
            }
            else {

                // assign new student
                studentCount++;

                pages = arr[i];

                // more students required
                if (studentCount > m) {
                    return false;
                }
            }
        }

        return true;
    }

    static int findPages(int[] arr, int n, int m) {

        // invalid case
        if (m > n)
            return -1;

        int low = 0;
        int high = 0;

        // low = max book
        // high = sum of all books

        for (int pages : arr) {

            low = Math.max(low, pages);

            high += pages;
        }

        int ans = -1;

        // binary search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(arr, n, m, mid)) {

                ans = mid;

                // try smaller answer
                high = mid - 1;
            }
            else {

                // increase limit
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};

        int n = arr.length;

        int m = 2;

        int ans = findPages(arr, n, m);

        System.out.println("Minimum pages = " + ans); //113
    }
}