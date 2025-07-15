//Question Link: https://leetcode.com/problems/top-k-frequent-elements/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int findMax(HashMap<Integer, Integer> hash) {
    int maxVal = 0;
    int maxKey = 0;
    for (Map.Entry<Integer, Integer> e : hash.entrySet()) {
      if (e.getValue() > maxVal) {
        maxVal = e.getValue();
        maxKey = e.getKey();
      }
    }
    return maxKey;
  }

  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    int[] res = new int[k];
    int index = 0;
    for (int ele : nums) {
      if (!hash.containsKey(ele))
        hash.put(ele, 1);
      else {
        int curr = hash.get(ele);
        hash.put(ele, ++curr);
      }
    }
    for (int i = 0; i < k; i++) {
      int max = findMax(hash);
      res[index] = max;
      index++;
      hash.remove(max);
    }
    return res;
  }
}
