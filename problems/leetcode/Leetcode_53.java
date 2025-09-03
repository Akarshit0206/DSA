//https://leetcode.com/problems/maximum-subarray/

//Kadanes Algorithm
class Solution {
  public int maxSubArray(int[] nums) {
    int ans = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum < 0) {
        sum = 0;
      }
      ans = Math.max(ans, sum);
    }
    return ans;
  }
}
