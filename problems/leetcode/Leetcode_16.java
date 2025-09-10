//Question Link: https://leetcode.com/problems/3sum-closest/description/

//This is bruteforce solution & will result in TLE
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int prevDiff = Integer.MAX_VALUE;
        int closestSum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff;
                    if (Math.abs(sum) > Math.abs(target)) {
                        diff = Math.abs(sum - target);
                    } else {
                        diff = Math.abs(target - sum);
                    }
                    if (diff < prevDiff) {
                        closestSum = sum;
                        prevDiff = diff;
                    }
                }
            }
        }
        return closestSum;
    }
}
