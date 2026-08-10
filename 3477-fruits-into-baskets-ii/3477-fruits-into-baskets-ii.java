class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      int a = fruits.length;
        boolean[] used = new boolean[a];
        int ans = 0;
        for (int fruit : fruits) {
        boolean placed = false;
        for (int i = 0; i < a; i++) {
         if (!used[i] && baskets[i] >= fruit) {
         used[i] = true;
            placed = true;
             break;
                }
            }
       if (!placed) ans++;
        }
        return ans;
    }
}  
    
