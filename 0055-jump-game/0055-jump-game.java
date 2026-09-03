class Solution {
    public boolean canJump(int[] nums) {
      int jum=0;
      for(int i=0;i<nums.length;i++){
        if(i>jum) return false;
        jum=Math.max(jum,i+nums[i]);
      } 
      return true; 
    }
}