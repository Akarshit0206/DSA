//Question Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {

  public static int findPeak(int nums[]) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (mid + 1 <= high && nums[mid] > nums[mid + 1])
        return mid;
      if (mid - 1 >= low && nums[mid] < nums[mid - 1])
        return mid - 1;
      if (nums[low] >= nums[mid])
        high = mid - 1;
      else
        low = mid + 1;
    }
    return -1;

  }

  public static int find(int[] nums, int target, int low, int high) {
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target)
        return mid;
      if (nums[mid] > target)
        high = mid;
      else
        low = mid + 1;
    }
    return -1;
  }

  public int search(int[] nums, int target) {
    int peak = findPeak(nums);
    if (peak == -1) {
      return find(nums, target, 0, nums.length);
    }
    if (nums[peak] == target)
      return peak;
    if (target >= nums[0]) {
      return find(nums, target, 0, peak);
    }
    return find(nums, target, peak + 1, nums.length);

  }
}
