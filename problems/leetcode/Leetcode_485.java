//Question Link: https://leetcode.com/problems/max-consecutive-ones/

class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      while (i < nums.length && nums[i] == 1) {
        count++;
        i++;
      }
      maxCount = Math.max(count, maxCount);
    }
    return maxCount;
  }
}
