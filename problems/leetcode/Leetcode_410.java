// Question Link: https://leetcode.com/problems/split-array-largest-sum/

class Solution {
  public static int min(int n1, int n2) {
    if (n1 >= n2)
      return n2;
    return n1;
  }

  public int findMax(int[] arr) {
    int max = 0;
    for (int ele : arr) {
      if (ele > max)
        max = ele;
    }
    return max;
  }

  public int minEatingSpeed(int[] piles, int h) {

    int low = 1;
    int high = findMax(piles);
    int res = high;
    while (low <= high) {
      int k = low + (high - low) / 2;
      int hours = 0;
      for (int ele : piles) {
        double hour = (double) ele / k;
        hours += Math.ceil(hour);
      }
      if (hours <= h) {
        res = min(res, k);
        high = k - 1;
      }
      if (hours > h)
        low = k + 1;
    }
    return res;
  }

}
