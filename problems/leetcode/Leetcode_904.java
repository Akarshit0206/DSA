//Question Link: https://leetcode.com/problems/fruit-into-baskets/description/

import java.util.HashMap;

class Solution {
  public int totalFruit(int[] fruits) {
    int leftPointer = 0, rightPointer = 0, maxLength = 0;
    HashMap<Integer, Integer> hash = new HashMap<>();

    while (rightPointer < fruits.length) {
      int fruitType = fruits[rightPointer];
      if (hash.get(fruitType) == null)
        hash.put(fruitType, 1);
      else
        hash.put(fruitType, hash.get(fruitType) + 1);
      while (hash.size() > 2) {
        hash.put(fruits[leftPointer], hash.get(fruits[leftPointer]) - 1);
        if (hash.get(fruits[leftPointer]) == 0)
          hash.remove(fruits[leftPointer]);
        leftPointer++;
      }
      maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
      rightPointer++;
    }
    return maxLength;
  }
}
