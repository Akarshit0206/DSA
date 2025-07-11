//Question Link:  https://leetcode.com/problems/contains-duplicate/

import java.util.HashMap;

class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    for (int ele : nums) {
      if (!hash.containsKey(ele)) {
        hash.put(ele, 0);
      } else
        return true;
    }
    return false;
  }
}
