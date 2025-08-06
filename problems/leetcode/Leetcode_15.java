//Question Link:https://leetcode.com/problems/3sum/description/

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    HashSet<List<Integer>> hashSetOfLists = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      HashSet<Integer> set = new HashSet<>();
      for (int j = i + 1; j < nums.length; j++) {
        int kValue = -(nums[i] + nums[j]);
        if (set.contains(kValue)) {
          List<Integer> li = new ArrayList<>(Arrays.asList(nums[i], nums[j], kValue));
          Collections.sort(li);
          hashSetOfLists.add(li);
        }
        set.add(nums[j]);
      }
    }
    List<List<Integer>> res = new ArrayList<>(hashSetOfLists);
    return res;
  }
}
