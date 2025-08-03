//Question Link: https://leetcode.com/problems/count-number-of-nice-subarrays/description/

class Solution {
  public int numberOfSubarraysLessOrEqualK(int[] nums, int k) {
    if (k < 0)
      return 0;
    int left = 0, right = 0, sum = 0, res = 0;
    while (right < nums.length) {
      sum += nums[right] % 2;
      while (sum > k) {
        sum -= nums[left] % 2;
        left++;
      }
      res += right - left + 1;
      right++;
    }
    return res;
  }

  public int numberOfSubarrays(int[] nums, int k) {
    return numberOfSubarraysLessOrEqualK(nums, k) - numberOfSubarraysLessOrEqualK(nums, k - 1);
  }
}
