//Question Link: https://leetcode.com/problems/longest-repeating-character-replacement/

import java.util.HashMap;

class Solution {
  public boolean isValid(HashMap<Character, Integer> hash, int k) {
    if (hash.size() > k + 1)
      return false;
    if (hash.size() == 1)
      return true;
    int sum = 0;
    int maxCount = 0;
    int max = 0;
    for (Integer val : hash.values()) {
      if (val > max)
        max = val;
    }
    for (Integer val : hash.values()) {
      if (val != max)
        sum += val;
      else
        maxCount++;
    }
    if (maxCount > 1) {
      sum += max * maxCount - max;
    }
    if (sum <= k)
      return true;
    return false;
  }

  public int characterReplacement(String s, int k) {
    int l = 0, r = 0, longestLength = 0;
    HashMap<Character, Integer> hash = new HashMap<>();
    while (r < s.length()) {
      char ch = s.charAt(r);
      if (hash.get(ch) == null)
        hash.put(ch, 1);
      else {
        hash.put(ch, hash.get(ch) + 1);
      }
      while (!isValid(hash, k)) {
        char leftChar = s.charAt(l);
        hash.put(leftChar, hash.get(leftChar) - 1);
        if (hash.get(leftChar) == 0)
          hash.remove(leftChar);
        l++;
        continue;
      }
      int length = r - l + 1;
      longestLength = Math.max(length, longestLength);

      r++;
    }
    return longestLength;
  }
}
