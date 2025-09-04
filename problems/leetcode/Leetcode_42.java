//Question Link: https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int len= height.length;
        int maxVal=Integer.MIN_VALUE;
        for(int ele: height){
            maxVal= Math.max(ele, maxVal);
        }
        int l=0;
        int r=len-1;
        int res=0;
        int leftMax= Integer.MIN_VALUE;
        int rightMax= Integer.MIN_VALUE;
        while(l<r){
            while(height[l]<maxVal){
                leftMax= Math.max(height[l], leftMax);
                res+= leftMax- height[l];
                l++;
            }
            rightMax= Math.max(height[r], rightMax);
            res+= rightMax- height[r];
            r--;
        }
        return res;
    }
}
