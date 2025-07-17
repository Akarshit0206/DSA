//Question Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/description/

class Solution {
  public int arraySign(int[] nums) {
    int count = 0;
    int index = 0;
    for (int ele : nums) {
      if (ele == 0)
        return 0;
      if (ele < 0) {
        count++;
      }
    }
    if (count % 2 == 0)
      return 1;
    return -1;
  }
}
