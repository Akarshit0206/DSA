//Question Link: https://leetcode.com/problems/rotate-array/

class Solution {
  public void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

  }

  public void rotate(int[] nums, int k) {

    int n = nums.length;
    k = k % n;

    // Reverse starting (n-k) elements
    reverse(nums, 0, n - k - 1);

    // Reverse last (k) elements
    reverse(nums, n - k, n - 1);

    // Reverse whole arrar
    reverse(nums, 0, n - 1);
  }
}
