//Question Link: https://leetcode.com/problems/richest-customer-wealth/description/

class Solution {
  public int maximumWealth(int[][] accounts) {

    int maxWealth = Integer.MIN_VALUE;
    for (int[] customer : accounts) {
      int totalWealth = 0;
      for (int wealth : customer) {
        totalWealth += wealth;
      }
      if (totalWealth > maxWealth)
        maxWealth = totalWealth;
    }

    return maxWealth;
  }
}
