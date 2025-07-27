//Question Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.Arrays;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int[] hash = new int[256];
    Arrays.fill(hash, -1);
    int size = 0;
    int maxSize = 0;
    int l = 0;
    int r = 0;
    int len = s.length();
    while (r < len) {
      char ch = s.charAt(r);
      int charCode = (int) ch;
      if (hash[charCode] != -1) {
        if (hash[charCode] >= l) {
          l = hash[charCode] + 1;
        }
      }
      size = r - l + 1;
      maxSize = Math.max(size, maxSize);
      hash[charCode] = r;
      r++;
    }
    return maxSize;
  }
}
