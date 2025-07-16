//Question Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> res = new ArrayList<>();
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
        res.add(nums[j]);
      }
    }
    return res;
  }
}
