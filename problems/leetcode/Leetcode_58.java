//Question Link: https://leetcode.com/problems/length-of-last-word/descrip

class Solution {
  public int lengthOfLastWord(String s) {
    String trimmed = s.trim();
    int len = 0;
    for (int i = trimmed.length() - 1; i >= 0; i--) {
      if (trimmed.charAt(i) == ' ')
        break;
      len++;
    }
    return len;
  }
}
