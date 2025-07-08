//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1691053472/

class Solution {
  public char nextGreatestLetter(char[] letters, char target) {
    int low = 0;
    int high = letters.length;
    if (target >= letters[high - 1]) {
      return letters[0];
    }
    while (low < high) {
      int mid = low + (high - low) / 2;

      if (letters[mid] <= target)
        low = mid + 1;
      else
        high = mid;
    }
    return letters[low];

  }
}
