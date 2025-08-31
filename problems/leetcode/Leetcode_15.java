//Question Link:https://leetcode.com/problems/3sum/description/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    int len = nums.length;
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      int j = i + 1;
      int k = len - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum < 0) {
          j++;
        } else if (sum > 0) {
          k--;
        } else {
          List<Integer> li = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
          res.add(li);
          j++;
          k--;
          while (j < k && nums[j] == nums[j - 1])
            j++;
          while (j < k && nums[k] == nums[k + 1])
            k--;
        }
      }
    }
    return res;
  }
}
