class Solution {
    public int maxVowels(String s, int k) {
      int r=0;
     int l=0;
     int count=0;

     while(r<k){
        char c=s.charAt(r);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') count++;
        r++;
     }
        int max=count;
     while(r<s.length()){
        char c1=s.charAt(l);
        if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') count--;
        
        char c2=s.charAt(r);
        if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u') count++;

        max =Math.max(max,count);
        l++;
        r++;
        
        if(max==k) return max;
     }
     return max;
    }
}