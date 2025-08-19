//Question link: https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
        int replace= nums.length-1;
        int len= nums.length;
        if(len==0) return 0;
        if(len==1 & nums[0]==val) return 0;
        int count=0;
        for(int i=0; i<=replace; i++){
            while(nums[i] == val){
                int temp= nums[i];
                nums[i] = nums[replace];
                nums[replace]= temp;
                count++;
                replace--;
                if(replace<i) break;
            }
        }
        return len-count;
    }
}
