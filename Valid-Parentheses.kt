class Solution {
    fun isValid(s: String): Boolean {
        val stack= ArrayDeque<Char>()
        val closeToOpenMap= mapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{'
        )
        for (c in s){
            if (c in closeToOpenMap){
                if (stack.isNotEmpty() && stack.last()==closeToOpenMap[c]){
                    stack.removeLast()
                }else{
                    return false
                }
            }else{
                stack.addLast(c)
            }
        }
        return stack.isEmpty()
    }
}