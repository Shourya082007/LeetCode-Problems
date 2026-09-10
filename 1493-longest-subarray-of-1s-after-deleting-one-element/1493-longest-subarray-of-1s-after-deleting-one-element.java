class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,zero=0,ans=0;

        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)
            zero++;

            while(zero>1){
                if(nums[l]==0)
                zero--;
                l++;
            }
            ans=Math.max(ans,r-l);
        }
        return ans;
    }
}