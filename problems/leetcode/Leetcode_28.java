//Question Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

class Solution {
  public int strStr(String haystack, String needle) {
    if (needle.length() > haystack.length())
      return -1;
    if (haystack.equals(needle))
      return 0;
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      int needleIndex = 0;
      if (haystack.charAt(i) == needle.charAt(needleIndex)) {
        int haystackIndex = i + 1;
        needleIndex++;
        boolean isMatched = true;
        while (needleIndex < needle.length()) {
          if (haystack.charAt(haystackIndex) != needle.charAt(needleIndex)) {
            isMatched = false;
            break;
          }
          needleIndex++;
          haystackIndex++;
        }
        if (isMatched)
          return i;
      }
    }
    return -1;
  }
}
