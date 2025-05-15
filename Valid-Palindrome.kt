class Solution {
    fun isPalindrome(s: String): Boolean {
    val modifiedString= s.lowercase().filter{ it.isLetterOrDigit()}
    return modifiedString==modifiedString.reversed()
    }
}