//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
  public static boolean isAvailable(int[] array, int target) {
    int low = 0;
    int high = array.length;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (array[mid] == target)
        return true;
      if (array[mid] < target)
        low = mid + 1;
      else
        high = mid;
    }
    return false;
  }

  public static int findFloor(int[] array, int target) {
    int low = 0;
    int high = array.length;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (target <= array[mid])
        high = mid;
      else
        low = mid + 1;
    }
    return low;
  }

  public static int findCeiling(int[] array, int target) {
    int low = 0;
    int high = array.length;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (target >= array[mid])
        low = mid + 1;
      else
        high = mid;
    }
    return high - 1;
  }

  public int[] searchRange(int[] nums, int target) {

    if (!isAvailable(nums, target))
      return new int[] { -1, -1 };

    return new int[] { findFloor(nums, target), findCeiling(nums, target) };
  }
}
