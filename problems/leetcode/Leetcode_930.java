//Question Link: https://leetcode.com/problems/binary-subarrays-with-sum/description/

class Solution {
  public int numSubarraysLessOrEqualSum(int[] nums, int goal) {
    if (goal < 0) {
      return 0;
    }
    int left = 0, right = 0, sum = 0, res = 0;
    while (right < nums.length) {
      sum += nums[right];
      while (sum > goal) {
        sum -= nums[left];
        left++;
      }
      res += (right - left + 1);
      right++;
    }
    return res;
  }

  public int numSubarraysWithSum(int[] nums, int goal) {
    return numSubarraysLessOrEqualSum(nums, goal) - numSubarraysLessOrEqualSum(nums, goal - 1);
  }
}
