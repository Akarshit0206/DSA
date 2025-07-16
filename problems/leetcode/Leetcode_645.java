//Question Link: https://leetcode.com/problems/set-mismatch/description/

class Solution {
  public int[] findErrorNums(int[] nums) {
    int[] res = { -1, -1 };
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i] - 1;
      if (nums[i] != nums[correctIndex]) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
      } else {
        i++;
      }
    }
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != j + 1) {
        res[0] = nums[j];
        res[1] = j + 1;
      }
    }
    return res;
  }
}
