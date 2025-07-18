//Question Link: https://leetcode.com/problems/product-of-array-except-self/description/

class Solution {
  public int[] productExceptSelf(int[] nums) {
    int size = nums.length;
    int[] res = nums.clone();
    int prefixProduct = 1;
    int postfixProduct = 1;
    for (int i = size - 1; i >= 0; i--) {
      int ele = nums[i];
      res[i] = postfixProduct * ele;
      postfixProduct = res[i];
    }
    for (int i = 0; i < size; i++) {
      int ele = nums[i];
      nums[i] = prefixProduct * ele;
      prefixProduct = nums[i];
    }
    for (int i = 0; i < size; i++) {
      int preProduct = 1;
      int postProduct = 1;
      if (i - 1 >= 0)
        preProduct = nums[i - 1];
      if (i + 1 < size)
        postProduct = res[i + 1];
      res[i] = preProduct * postProduct;
    }
    return res;
  }
}
