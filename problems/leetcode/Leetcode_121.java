//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
  public int maxProfit(int[] prices) {
    int len = prices.length;
    int left = 0, right = 1, maxProfit = 0;
    while (right < len) {
      if (prices[left] > prices[right]) {
        left++;
        continue;
      }
      int profit = prices[right] - prices[left];
      maxProfit = Math.max(profit, maxProfit);
      right++;
    }
    return maxProfit;
  }
}
