//Question Link: https://leetcode.com/problems/two-sum/description/

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] ans = { 0, 0 };
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        if (nums[i] + nums[j] == target && i != j) {
          ans[0] = i;
          ans[1] = j;
          break;
        }
      }
    }
    return ans;
  }
}
