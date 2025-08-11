//Question Link: https://leetcode.com/problems/plus-one/description/

class Solution {
  public int nineCount(int[] arr) {
    int count = 0;
    for (int ele : arr) {
      if (ele == 9) {
        count++;
      }
    }
    return count;
  }

  public int[] plusOne(int[] digits) {
    int len = digits.length;
    if (digits[len - 1] != 9) {
      int[] res = digits.clone();
      res[len - 1] = digits[len - 1] + 1;
      return res;
    }
    if (nineCount(digits) == len) {
      int[] res = new int[len + 1];
      res[0] = 1;
      return res;
    }
    int[] res = digits.clone();
    int last = len - 1;
    res[last] = 0;
    last--;
    while (true) {
      System.out.println(last);
      if (res[last] == 9) {
        res[last] = 0;
        last--;
      } else {
        res[last] = digits[last] + 1;
        break;
      }
    }
    return res;
  }
}
