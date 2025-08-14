//Question Link: https://leetcode.com/problems/container-with-most-water/description/

class Solution {
  public int maxArea(int[] height) {
    int left = 0, maxArea = 0;
    int len = height.length;
    while (left < len) {
      int right = left + 1;
      if (height[left] * (len - left) > maxArea) {
        while (right < len) {
          int windowSize = right - left;
          int area = Math.min(height[left], height[right]) * windowSize;
          maxArea = Math.max(area, maxArea);
          right++;
        }
      }
      left++;
    }
    return maxArea;
  }
}
