class Solution {
    public int maxFrequencyElements(int[] nums) {
       int[] freq=new int[101];

       for(int n:nums){
        freq[n]++;
       } 
       int max=0;
       for(int x:freq){
        max=Math.max(max,x);
       }
       int ans=0;
       for(int x:freq){
        if(x==max){
            ans+=x;
        }
       }
       return ans;
    }
}