class Solution {
    public int climbStairs(int n) {
       if(n<=2) return n;
       int t=1;
       int s=2;
       for(int i=3;i<=n;i++){
        int total =s+t;
        t=s;
        s=total;
       }
       return s;
    }
}
    