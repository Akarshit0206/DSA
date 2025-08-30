//Question Link: https://leetcode.com/problems/monotonic-array/

class Solution {
  public boolean monotonicInc(int[] nums) {
    int len = nums.length;
    if (len == 1)
      return true;
    int i = 0;
    int j = i + 1;
    while (j < len) {
      if (nums[j] < nums[i]) {
        return false;
      }
      i++;
      j++;
    }
    return true;
  }

  public boolean monotonicDec(int[] nums) {
    int len = nums.length;
    if (len == 1)
      return true;
    int i = 0;
    int j = i + 1;
    while (j < len) {
      if (nums[j] > nums[i]) {
        return false;
      }
      i++;
      j++;
    }
    return true;
  }

  public boolean isMonotonic(int[] nums) {
    return monotonicInc(nums) || monotonicDec(nums);
  }
}
