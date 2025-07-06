public class OrderAgnosticBinarySearch {
  public int search(int[] haystack, int needle) {
    int low = 0;
    int high = haystack.length;
    boolean isAsc = haystack[low] < haystack[high - 1];

    while (low < high) {
      int mid = low + (high - low) / 2;
      int val = haystack[mid];
      if (val == needle)
        return mid;
      if (isAsc) {
        if (val > needle)
          high = mid;
        else
          low = mid + 1;
      } else {
        if (val > needle)
          low = mid + 1;
        else
          high = mid;
      }
    }
    return -1;
  }
}
