class Solution {
    public boolean isPalindrome(String s) {
       int l = 0 ;
       int r = s.length()-1 ;
       while (l < r){
        while(l < r && !isAlphanumeric(s.charAt(l))){
            l++;
        }
        while(l < r && !isAlphanumeric(s.charAt(r))){
            r--;
        }
        if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
            return false;
        }
        l++;
        r--;
       }
       return true;

    }
    private boolean isAlphanumeric (char c){
        return (c >='A' && c <= 'Z') || (c >='a' && c <= 'z') || (c >='0' && c <= '9');
    }
}