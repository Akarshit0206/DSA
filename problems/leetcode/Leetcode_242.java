//Question Link: https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;

class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;
    char[] arrayOfS = s.toCharArray();
    char[] arrayOfT = t.toCharArray();
    Arrays.sort(arrayOfS);
    Arrays.sort(arrayOfT);

    return Arrays.equals(arrayOfS, arrayOfT);

  }
}
