//Question Link: https://leetcode.com/problems/single-element-in-a-sorted-array/description/

class Solution {
  public int singleNonDuplicate(int[] nums) {
    int ans = 0;
    for (int i = 0; i < nums.length; i += 2) {
      if (i + 1 < nums.length && nums[i + 1] != nums[i]) {
        ans = nums[i];
        break;
      }
      if (i + 1 >= nums.length) {
        ans = nums[i];
        break;
      }
    }
    return ans;
  }
}
