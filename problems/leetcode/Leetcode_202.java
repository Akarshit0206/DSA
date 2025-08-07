//Question Link: https://leetcode.com/problems/happy-number/description/

import java.util.HashSet;

class Solution {
  public int sqSumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
      int mod = n % 10;
      sum += mod * mod;
      n /= 10;
    }
    return sum;
  }

  public boolean isHappy(int n) {
    int res = sqSumOfDigits(n);
    if (res == 1)
      return true;
    HashSet<Integer> set = new HashSet<>();
    set.add(res);
    for (int i = 0; i <= Math.sqrt(n) + 1; i++) {
      int next = sqSumOfDigits(res);
      if (set.contains(next))
        return false;
      if (next == 1)
        return true;
      res = next;
      set.add(res);
    }
    return false;
  }
}
