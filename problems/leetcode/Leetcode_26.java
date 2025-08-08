//Qestion Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1728280345/

class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int k = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[k - 1]) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
}
