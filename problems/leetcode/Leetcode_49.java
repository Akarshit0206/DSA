//Question Link: https://leetcode.com/problems/group-anagrams/description/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
  public static boolean isAnagram(String st1, String st2) {
    if (st1.length() != st2.length())
      return false;
    char[] arrayOfSt1 = st1.toCharArray();
    char[] arrayOfSt2 = st2.toCharArray();
    Arrays.sort(arrayOfSt1);
    Arrays.sort(arrayOfSt2);
    return Arrays.equals(arrayOfSt1, arrayOfSt2);
  }

  public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> res = new ArrayList<>();
    List<Integer> addedIndex = new ArrayList<>();
    for (int i = 0; i < strs.length; i++) {
      if (addedIndex.contains(i))
        continue;
      List<String> internalList = new ArrayList<>();
      String st = strs[i];
      for (int j = i + 1; j < strs.length; j++) {
        if (isAnagram(st, strs[j])) {
          internalList.add(strs[j]);
          addedIndex.add(j);
        }
      }
      internalList.add(st);
      res.add(internalList);
    }
    return res;
  }
}
