//Question Link: https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/

class Solution {
  public int maximizeSum(int[] nums, int k) {
    int max = Integer.MIN_VALUE;
    int maxIndex = -1;
    int maxSum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxIndex = i;
      }
    }
    for (int i = 0; i < k; i++) {
      maxSum += max;
      nums[maxIndex] = ++max;
    }
    return maxSum;
  }
}
