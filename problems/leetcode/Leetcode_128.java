//Question Link: https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;

class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0)
      return 0;
    HashSet<Integer> set = new HashSet<>();
    int maxCount = 1;
    for (int ele : nums) {
      set.add(ele);
    }
    for (int i : set) {
      if (set.contains(i - 1))
        continue;
      int count = 1;
      while (set.contains(i + 1)) {
        count++;
        i++;
      }
      if (count > maxCount)
        maxCount = count;
    }
    return maxCount;
  }
}
