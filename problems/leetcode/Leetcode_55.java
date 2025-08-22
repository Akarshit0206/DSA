//Question Link: https://leetcode.com/problems/jump-game/description/

class Solution {
  public boolean canJump(int[] nums) {
    int len = nums.length - 1;
    if (len == 0)
      return true;
    int maxJump = 0;

    for (int i = 0; i < len; i++) {
      if (i > maxJump) {
        return false;
      }
      maxJump = Math.max(i + nums[i], maxJump);
      if (maxJump >= len) {
        return true;
      }
    }
    return false;
  }
}
