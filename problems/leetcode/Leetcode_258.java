//Question Link: https://leetcode.com/problems/add-digits/description/

class Solution {
    public int add(int num){
        int sum=0;
        while(num>0){
            int mod= num%10;
            sum+=mod;
            num/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int ans=num;
        while(ans>=10){
            ans= add(ans);
        }
        return ans;
    }
}
