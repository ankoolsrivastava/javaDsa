package Array;
import java.util.*;

public class PainterPartition {

    // checks if painting is possible
    static boolean isPossible(int[] boards, int n, int k, int maxLength) {

        int painterCount = 1;

        int paintedLength = 0;

        for (int i = 0; i < n; i++) {

            // current painter can paint this board
            if (paintedLength + boards[i] <= maxLength) {

                paintedLength += boards[i];
            }
            else {

                // assign new painter
                painterCount++;

                paintedLength = boards[i];

                // too many painters needed
                if (painterCount > k) {
                    return false;
                }
            }
        }

        return true;
    }

    static int minTime(int[] boards, int n, int k) {

        int low = 0;
        int high = 0;

        // low = max board
        // high = total sum

        for (int board : boards) {

            low = Math.max(low, board);

            high += board;
        }

        int ans = -1;

        // binary search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(boards, n, k, mid)) {

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

        int[] boards = {10, 20, 30, 40};

        int n = boards.length;

        int k = 2;

        int ans = minTime(boards, n, k);

        System.out.println("Minimum time = " + ans); //60
    }
}
