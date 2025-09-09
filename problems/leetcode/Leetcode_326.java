//Question Link: https://leetcode.com/problems/power-of-three/description/

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        int nCopy = n;
        while (n > 1 && n % 3 == 0) {
            n /= 3;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }
}
