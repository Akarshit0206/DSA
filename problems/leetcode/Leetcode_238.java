//Question Link: https://leetcode.com/problems/product-of-array-except-self/description/

class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;

    int[] prefixArray = new int[n];
    prefixArray[0] = 1;
    for (int i = 1; i < n; i++) {
      prefixArray[i] = prefixArray[i - 1] * nums[i - 1];
    }

    int[] postfixArray = new int[n];
    postfixArray[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) {
      postfixArray[i] = postfixArray[i + 1] * nums[i + 1];
    }

    for (int i = 0; i < n; i++) {
      prefixArray[i] = prefixArray[i] * postfixArray[i];
    }
    return prefixArray;
  }
}
