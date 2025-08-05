//Question Link: https://leetcode.com/problems/two-sum/description/
import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> hash = new HashMap<>();
    int[] res = { 0, 0 };
    for (int i = 0; i < nums.length; i++)
      hash.put(nums[i], i);
    for (int i = 0; i < nums.length; i++) {
      int secondNumber = target - nums[i];
      if (hash.get(secondNumber) != null && hash.get(secondNumber) != i) {
        res[0] = i;
        res[1] = hash.get(secondNumber);
        break;
      }
    }
    return res;
  }
}
