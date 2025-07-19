//Question Link: https://leetcode.com/problems/valid-palindrome/description/

class Solution {
  public boolean isPalindrome(String s) {
    String st = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isLetterOrDigit(ch)) {
        st += ch;
      }
    }
    st = st.toLowerCase();
    int l = 0;
    int r = st.length() - 1;
    while (l <= r) {
      if (st.charAt(l) != st.charAt(r))
        return false;
      l++;
      r--;
    }
    return true;
  }
}
