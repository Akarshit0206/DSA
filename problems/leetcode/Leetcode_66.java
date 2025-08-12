//Question Link: https://leetcode.com/problems/plus-one/description/

class Solution {
  public int[] plusOne(int[] digits) {
    int len = digits.length;
    int[] res = digits.clone();
    int last = len - 1;
    while (last >= 0 && res[last] == 9) {
      res[last] = 0;
      last--;
    }
    if (last == -1) {
      int[] finalRes = new int[len + 1];
      finalRes[0] = 1;
      return finalRes;
    }
    res[last] = res[last] + 1;
    return res;
  }
}
