//Question Link: https://leetcode.com/problems/delete-characters-to-make-fancy-string/

class Solution {
  public String makeFancyString(String s) {
    StringBuilder st = new StringBuilder();
    st.append(s.charAt(0));
    int count = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i - 1) == s.charAt(i)) {
        count++;
        if (count < 2) {
          st.append(s.charAt(i));
        } else {
          count--;
        }
      } else {
        st.append(s.charAt(i));
        count = 0;
      }
    }
    return st.toString();
  }
}
