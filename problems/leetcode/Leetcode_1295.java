// Question Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

class Solution {
  public boolean isEvenDigits(int ele) {
    int digitCount = 0;
    while (ele != 0) {
      digitCount++;
      ele /= 10;
    }
    if (digitCount % 2 == 0)
      return true;
    return false;

  }

  public int findNumbers(int[] nums) {
    int count = 0;
    for (int ele : nums) {
      if (isEvenDigits(ele))
        count++;
    }
    return count;

  }
}
