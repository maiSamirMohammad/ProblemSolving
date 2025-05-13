class Solution {
    fun isPalindrome(s: String): Boolean {
        var left=0
        var right=s.length-1
        while (left < right){
            while(left< right && !isAlphanumeric(s[left])){
                left++
            }
            while(left< right && !isAlphanumeric(s[right])){
                right--
            }
            if (s[left].lowercaseChar() != s[right].lowercaseChar()){
                return false
            }
            left++
            right--
        }
        return true
    }
    private fun isAlphanumeric(c:Char)=(c in 'a'..'z') || (c in 'A'..'Z') || (c in '0'..'9')
}