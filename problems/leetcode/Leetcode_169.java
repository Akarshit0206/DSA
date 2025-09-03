//https://leetcode.com/problems/majority-element/description/

class Solution {
  public int majorityElement(int[] nums) {
    int ele = nums[0];
    int vote = 0;
    ;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == ele) {
        vote++;
      } else {
        vote--;
        if (vote == 0) {
          ele = nums[i];
          vote = 1;
        }
      }
    }

    return ele;
  }
}
