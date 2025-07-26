//exaple Question to understand Algorithm: **Return the size of longest subarray with sum ≤ k.**

//"This is the basic template which other question of this pattern follow"

//*This optimization of while loop to restrict the window's size to go below maxSize works if we have to find the length of longest subArray but if we have to return the subArray itself so we have use the older approach and stick to nested while loop as this can approach incorrect result*

class DynamicWindow {
  public static int longestSubarraySize(int[] arr, int k) {
    int l = 0;
    int r = 0;
    int maxLength = 0;
    int sum = 0;
    while (r < arr.length) {
      sum += arr[r];
      if (sum > k) {
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
