//https://leetcode.com/problems/subarrays-with-k-different-integers/description/

import java.util.HashMap;

class Solution {
    public int subarraysLessOrEqualK(int[] nums, int k) {
        int len = nums.length, l = 0, r = 0, count = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        while (r < len) {
            hash.put(nums[r], hash.getOrDefault(nums[r], 0) + 1);
            while (hash.size() > k) {
                hash.put(nums[l], hash.get(nums[l]) - 1);
                if (hash.get(nums[l]) == 0) {
                    hash.remove(nums[l]);
                }
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        int lessOrEqualK = subarraysLessOrEqualK(nums, k);
        int lessOrEqualKminus1 = subarraysLessOrEqualK(nums, k - 1);
        return lessOrEqualK - lessOrEqualKminus1;
    }
}
