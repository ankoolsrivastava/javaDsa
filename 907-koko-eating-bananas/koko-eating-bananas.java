class Solution {
    public boolean canEat(int[] piles, int mid, int h) {
        long totalhr = 0;
        for (int i : piles) {
            totalhr += i / mid;
            if(i%mid!=0){
                totalhr++;
            }
        }
        return totalhr<=h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (canEat(piles, mid, h)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}