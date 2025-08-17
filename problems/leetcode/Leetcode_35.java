//Question Link: https://leetcode.com/problems/search-insert-position/description/

class Solution {
  public int searchInsert(int[] nums, int target) {
    int low = 0, high = nums.length - 1, eleIndex = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target)
        return mid;
      if (nums[mid] < target) {
        eleIndex = mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return eleIndex + 1;
  }
}
