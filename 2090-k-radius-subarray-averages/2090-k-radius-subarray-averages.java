class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] result=new int[n];
        Arrays.fill(result, -1);
        int l=0; 
        int r=0;
        int w=2*k+1;

        if(k==0) return nums;

        if(w>n) return result;
        long sum=0;
        while(r<w){
        sum +=nums[r];
        r++;
        }
        result[k]=(int) (sum/w);
        k++;

        while(r<n){
            sum += nums[r];
            sum -= nums[l];
            result [k]=(int) (sum/w);
            k++;
            l++;
            r++;
        }
        return result;
    }
}