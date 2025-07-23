//Question Link: https://leetcode.com/problems/group-anagrams/description/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> hash = new HashMap<>();
    List<List<String>> res = new ArrayList<>();
    for (int i = 0; i < strs.length; i++) {
      int[] count = new int[26];
      List<String> li = new ArrayList<>();
      for (int j = 0; j < strs[i].length(); j++) {
        count[strs[i].codePointAt(j) - 97] += 1;
      }
      String countString = Arrays.toString(count);

      if (hash.get(countString) == null) {
        li.add(strs[i]);
        hash.put(countString, li);
        continue;
      }
      hash.get(countString).add(strs[i]);
    }
    for (List<String> li : hash.values()) {
      res.add(li);
    }
    return res;
  }
}
