//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
  public int maxProfit(int[] prices) {
    int len = prices.length;
    int left = 0, leastBuyValue = Integer.MAX_VALUE, maxProfit = 0;
    while (left < len - 1) {
      if (prices[left] < leastBuyValue) {
        int right = len - 1;
        while (right > left) {
          int profit = prices[right] - prices[left];
          maxProfit = Math.max(profit, maxProfit);
          right--;
        }
        leastBuyValue = prices[left];
      }
      left++;
    }
    return maxProfit;

  }
}
