//Question Link: https://leetcode.com/problems/split-array-largest-sum/

class Solution {
  public int maxInArray(int[] nums) {
    int max = 0;
    for (int ele : nums) {
      if (ele > max)
        max = ele;
    }
    return max;
  }

  public int sumOfArray(int[] nums) {
    int sum = 0;
    for (int ele : nums) {
      sum += ele;
    }
    return sum;
  }

  public int splitArray(int[] nums, int k) {
    int low = maxInArray(nums);
    int high = sumOfArray(nums);
    while (low < high) {
      int mid = low + (high - low) / 2;
      int count = 1;
      int sum = 0;
      for (int i = 0; i < nums.length + 1;) {
        if (sum > mid) {
          count++;
          sum = nums[i - 1];
          continue;
        }
        if (i < nums.length) {
          sum += nums[i];
        }
        i++;
      }
      if (count <= k)
        high = mid;
      else
        low = mid + 1;
    }
    return low;
  }
}
