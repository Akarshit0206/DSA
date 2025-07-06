
class Solution {
  public int binarySearch(int[] haystack, int needle) {
    int low = 0;
    int high = haystack.length;
    while (low < high) {
      int mid = low + (high - low) / 2;
      int val = haystack[mid];

      if (val == needle)
        return mid;
      if (val > needle)
        high = mid;
      else
        low = mid + 1;
    }
    return -1;
  }

}
