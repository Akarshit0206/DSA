//Question Link: https://leetcode.com/problems/roman-to-integer/description/

import java.util.HashMap;

class Solution {
  public int romanToInt(String s) {
    HashMap<Character, Integer> hash = new HashMap<>();
    hash.put('I', 1);
    hash.put('V', 5);
    hash.put('X', 10);
    hash.put('L', 50);
    hash.put('C', 100);
    hash.put('D', 500);
    hash.put('M', 1000);
    int res = 0;
    if (s.length() == 1) {
      return hash.get(s.charAt(0));
    }

    for (int i = 0; i < s.length() - 1; i++) {
      char curr = s.charAt(i);
      char next = s.charAt(i + 1);
      if (hash.get(curr) < hash.get(next)) {
        res += hash.get(next) - hash.get(curr);
        i++;
        continue;
      } else {
        res += hash.get(curr);
      }
    }
    char last = s.charAt(s.length() - 1);
    char secondLast = s.charAt(s.length() - 2);
    if (hash.get(last) <= hash.get(secondLast)) {
      res += hash.get(last);
    }
    return res;

  }
}
