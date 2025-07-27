//Question Link: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
  public int maxScore(int[] cardPoints, int k) {
    int len = cardPoints.length;
    int sum = 0;
    if (k == len) {
      for (int i = 0; i < len; i++) {
        sum += cardPoints[i];
      }
      return sum;
    }
    for (int i = 0; i < k; i++) {
      sum += cardPoints[i];
    }
    int maxSum = sum;
    int rightPointer = len - 1;
    for (int i = k - 1; i >= 0; i--) {
      sum -= cardPoints[i];
      sum += cardPoints[rightPointer];
      rightPointer--;
      maxSum = Math.max(sum, maxSum);
    }
    return maxSum;
  }
}
