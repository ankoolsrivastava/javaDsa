class Solution {
    static int isBouquet(int[] bloomDay, int days, int k) {
        int n = bloomDay.length;
        int adjacent = 0;
        int noOfBouquet = 0;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= days) {
                adjacent++;

                if (adjacent == k) {
                    noOfBouquet++;
                    adjacent = 0;
                }
            } else {
                adjacent = 0;
            }

        }
        return noOfBouquet;

    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) {
            return -1;
        }
        int result = -1;
        int start = 0;
        int end = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            end = Math.max(day, end);
        }
        while (start <= end) {
            int days = start + (end - start) / 2;
            if (isBouquet(bloomDay, days, k) >= m) {
                result = days;
                end = days - 1;
            } else {
                start = days + 1;
            }
        }
        return result;
    }
}