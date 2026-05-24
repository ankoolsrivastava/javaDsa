package Array;

public class BuySell {

    public static int profit(int[] prices) {
        // 1. The edge case check !
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // 2. The core Kadane's/Greedy logic
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    // 3. A main method so you can run and verify your code
    public static void main(String[] args) {
        // Test Case 1: Standard profit scenario
        int[] testPrices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit for test 1: " + profit(testPrices1)); // Expected: 5 (Buy at 1, sell at 6)

        // Test Case 2: Prices only go down (no profit possible)
        int[] testPrices2 = {7, 6, 4, 3, 1};
        System.out.println("Max profit for test 2: " + profit(testPrices2)); // Expected: 0

        // Test Case 3: Testing our edge case bouncer
        int[] testPrices3 = {};
        System.out.println("Max profit for empty array: " + profit(testPrices3)); // Expected: 0
    }
}