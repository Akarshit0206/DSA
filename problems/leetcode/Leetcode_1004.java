//Question Link: https://leetcode.com/problems/max-consecutive-ones-iii/description/

class Solution {
  public int longestOnes(int[] nums, int k) {
    int leftPointer = 0, rightPointer = 0, zerosCount = 0, maxLength = 0, len = 0;
    while (rightPointer < nums.length) {
      if (nums[rightPointer] == 0)
        zerosCount++;
      while (zerosCount > k) {
        if (nums[leftPointer] == 0)
          zerosCount--;
        leftPointer++;
      }
      len = rightPointer - leftPointer + 1;
      maxLength = Math.max(maxLength, len);
      rightPointer++;
    }
    return maxLength;
  }
}
