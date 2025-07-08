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

  public static int findCeiling(int[] array, int target) {
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

  public int[] searchRange(int[] nums, int target) {

    if (!isAvailable(nums, target))
      return new int[] { -1, -1 };

    int startingIndex = findCeiling(nums, target);
    int endingIndex = startingIndex;
    while (endingIndex + 1 < nums.length && nums[endingIndex + 1] == nums[startingIndex])
      endingIndex++;

    return new int[] { startingIndex, endingIndex };
  }
}
