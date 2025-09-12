//https://leetcode.com/problems/power-of-four/description/

class Solution {
    public boolean isPowerOfFour(int n) {
        int nCopy=n;
        while(nCopy>=4 && nCopy%4==0){
            nCopy/=4;
        }
        if(nCopy==1){
            return true;
        }
        return false;
    }
}
