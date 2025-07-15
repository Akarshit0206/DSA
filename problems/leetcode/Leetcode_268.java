//Question Link: https://leetcode.com/problems/missing-number/

class Solution {
  public int missingNumber(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      boolean isSwapped = false;
      for (int j = 0; j < nums.length - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
          isSwapped = true;
        }
      }
      if (!isSwapped)
        break;
    }
    int check = 0;
    for (int ele : nums) {
      if (ele == check) {
        check++;
      } else
        break;
    }
    return check;
  }
}
