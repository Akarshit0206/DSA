//Question Link: https://leetcode.com/problems/power-of-two/description/

class Solution {
  public boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }

    int mask = n - 1;
    boolean res = (n & mask) == 0;
    return res;
  }
}
