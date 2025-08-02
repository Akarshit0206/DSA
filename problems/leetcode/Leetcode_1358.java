//Question Link:  https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

class Solution {
  public int min(int n1, int n2, int n3) {
    int min1 = Math.min(n1, n2);
    return Math.min(min1, n3);
  }

  public int numberOfSubstrings(String s) {
    int[] hashArray = { -1, -1, -1 };
    int right = 0, res = 0;
    while (right < s.length()) {
      char ch = s.charAt(right);
      hashArray[ch - 'a'] = right;
      if (hashArray[0] != -1 && hashArray[1] != -1 && hashArray[2] != -1) {
        res = res + (1 + min(hashArray[0], hashArray[1], hashArray[2]));
      }
      right++;
    }
    return res;
  }
}
