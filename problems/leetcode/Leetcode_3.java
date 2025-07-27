//Question Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.List;
import java.util.ArrayList;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    List<Character> li = new ArrayList<>();
    int maxLength = 0;
    int length = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (li.contains(ch)) {
        li.remove(0);
        length--;
      }
      li.add(ch);
      length++;
      maxLength = Math.max(length, maxLength);
    }
    return maxLength;
  }
}
