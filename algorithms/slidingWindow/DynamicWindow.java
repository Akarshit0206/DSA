//exaple Question to understand Algorithm: **Return the size of longest subarray with sum ≤ k.**

//"This is the basic template which other question of this pattern follow"

class DynamicWindow {
  public static int longestSubarraySize(int[] arr, int k) {
    int l = 0;
    int r = 0;
    int maxLength = 0;
    int sum = 0;
    while (r < arr.length) {
      sum += arr[r];
      while (sum > k) {
        sum -= arr[l];
        l++;
      }
      maxLength = Math.max(maxLength, r - l + 1);
      r++;
    }
    return maxLength;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 1, 1, 1 };
    int k = 2;
    int res = longestSubarraySize(arr, k);
    System.out.println(res);
  }

}
