//Question-Link:https://leetcode.com/problems/fizz-buzz/submissions/1737729936/?envType=problem-list-v2&envId=string

import java.util.List;
import java.util.ArrayList;

class Solution {
  public List<String> fizzBuzz(int n) {
    List<String> res = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        res.add("FizzBuzz");
      } else if (i % 3 == 0) {
        res.add("Fizz");
      } else if (i % 5 == 0) {
        res.add("Buzz");
      } else {
        res.add(String.format("%d", i));
      }
    }
    return res;
  }
}
