class Solution {
  public char nextGreatestLetter(char[] letters, char target) {
    int low = 0;
    int high = letters.length;
    if (target >= letters[high - 1]) {
      return letters[0];
    }
    while (low < high) {
      int mid = low + (high - low) / 2;
      char val = letters[mid];

      if (val == target) {
        while (letters[mid] == target)
          mid += 1;
        return letters[mid];
      }
      if (val < target)
        low = mid + 1;
      else
        high = mid;
    }
    return letters[low];

  }
}
