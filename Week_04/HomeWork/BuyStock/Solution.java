package HomeWork.BuyStock;

/**
 * 122.买卖股票的最佳时机 II 贪心算法
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        if (1 == prices.length) return 0;
        int old = prices[0];
        for (int i : prices) {
            if (i > old) {
                profit += i - old;
            }
            old = i;
        }
        return profit;
    }

}
