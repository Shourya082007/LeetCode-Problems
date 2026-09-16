class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans=new ArrayList<>();

        int n=nums.length;
        for(int i=1;i<=nums.length;i++){
            if (binarySearch(nums, i) == false) {
                ans.add(i);
            }
        }
        return ans;
       
       }
       public boolean binarySearch(int[] nums, int target) { 
        
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target)  r=mid-1;
            else l=mid+1;
        }
        return false;
       
    }
}