//Question Link:  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int leftPointer = 0;
    int rightPointer = numbers.length - 1;
    int[] res = { -1, -1 };
    while (leftPointer <= rightPointer) {
      int leftValue = numbers[leftPointer];
      int rightValue = numbers[rightPointer];
      int sum = leftValue + rightValue;
      if (sum == target) {
        res[0] = leftPointer + 1;
        res[1] = rightPointer + 1;
        break;
      }
      if (sum > target) {
        --rightPointer;
        continue;
      }
      leftPointer++;
    }
    return res;
  }
}
