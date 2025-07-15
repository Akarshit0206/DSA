//Question Link: https://leetcode.com/problems/missing-number/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int missingNumber(int[] nums) {
    HashMap<Integer, Integer> hash = new HashMap<>();
    int res = 0;
    for (int i = 0; i <= nums.length; i++)
      hash.put(i, 0);
    for (int ele : nums) {
      hash.put(ele, 1);
    }
    for (Map.Entry<Integer, Integer> e : hash.entrySet()) {
      if (e.getValue() == 0) {
        res = e.getKey();
        break;
      }
    }
    return res;
  }
}
