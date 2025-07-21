//Question Link: https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0)
      return 0;
    HashMap<Integer, Integer> hash = new HashMap<>();
    int maxCount = 1;
    for (int ele : nums) {
      hash.put(ele, 1);
    }
    for (Map.Entry<Integer, Integer> e : hash.entrySet()) {
      int key = e.getKey();
      if (hash.get(key - 1) != null) {
        continue;
      }
      int next = key + 1;
      int count = 1;
      while (hash.get(next) != null) {
        count++;
        next++;

      }
      if (count > maxCount)
        maxCount = count;
    }
    return maxCount;
  }
}
