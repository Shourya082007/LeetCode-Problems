class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            char first=s.charAt(l);
            char last=s.charAt(r);
            if(!Character.isLetterOrDigit(first)){
                l++;
            }
            else if(!Character.isLetterOrDigit(last)){
                r--;
            }else{
                if(Character.toLowerCase(first) != Character.toLowerCase(last)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;

    }
}