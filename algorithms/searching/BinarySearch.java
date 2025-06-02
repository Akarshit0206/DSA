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

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = { 1, 3, 5, 7, 9 };
    System.out.println(sol.binarySearch(arr, 9));
  }

}
