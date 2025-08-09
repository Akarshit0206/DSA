//Question Link: https://leetcode.com/problems/move-zeroes/description/

class Solution {
  public void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        int j = i + 1;
        while (j < nums.length && nums[j] == 0)
          j++;
        if (j < nums.length) {
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
          continue;
        }
      }
    }
  }
}
