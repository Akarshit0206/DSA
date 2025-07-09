//Question Link: https://leetcode.com/problems/find-in-mountain-array/

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {

  public static int findPeak(MountainArray mountainArr) {
    int low = 0;
    int high = mountainArr.length() - 1;
    while (low < high) {
      int mid = low + (high - low) / 2;
      int midVal = mountainArr.get(mid);
      int nextVal = mountainArr.get(mid + 1);
      if (midVal < nextVal)
        low = mid + 1;
      if (midVal > nextVal)
        high = mid;
    }
    return low;
  }

  public static int search(MountainArray mountainArr, int target, int low, int high) {
    int lowVal = mountainArr.get(low);
    int highVal = mountainArr.get(high - 1);
    while (low < high) {
      int mid = low + (high - low) / 2;
      int midVal = mountainArr.get(mid);
      if (midVal == target)
        return mid;
      if (lowVal < highVal) {
        if (midVal > target)
          high = mid;
        else
          low = mid + 1;
      } else {
        if (midVal > target)
          low = mid + 1;
        else
          high = mid;
      }
    }
    return -1;
  }

  public int findInMountainArray(int target, MountainArray mountainArr) {
    int peak = findPeak(mountainArr);
    int firstSearch = search(mountainArr, target, 0, peak + 1);
    if (firstSearch == -1) {
      return search(mountainArr, target, peak, mountainArr.length());
    } else
      return firstSearch;
  }
}
