//Question Link: https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;
    HashMap<Character, Integer> hashS = new HashMap<>();
    HashMap<Character, Integer> hashT = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (hashS.get(ch) == null) {
        hashS.put(ch, 1);
        continue;
      }
      int count = hashS.get(ch);
      hashS.put(ch, ++count);
    }
    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      if (hashT.get(ch) == null) {
        hashT.put(ch, 1);
        continue;
      }
      int count = hashT.get(ch);
      hashT.put(ch, ++count);
    }
    return hashS.equals(hashT);
  }
}
