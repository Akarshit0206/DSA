//Question Link: https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char characterOfS = s.charAt(i);
      char characterOfT = t.charAt(i);
      boolean wasNullS = false;
      boolean wasNullT = false;
      if (charCount.get(characterOfS) == null) {
        charCount.put(characterOfS, 1);
        wasNullS = true;
      }
      if (charCount.get(characterOfT) == null) {
        charCount.put(characterOfT, -1);
        wasNullT = true;
      }
      if (!wasNullS)
        charCount.put(characterOfS, charCount.get(characterOfS) + 1);
      if (!wasNullT)
        charCount.put(characterOfT, charCount.get(characterOfT) - 1);
    }
    System.out.println(charCount);
    for (int count : charCount.values()) {
      if (count != 0)
        return false;
    }

    return true;
  }
}
