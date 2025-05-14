class Solution {
    fun isAnagram(s: String, t: String): Boolean {
     if (s.length != t.length){
        return false
     }
     val sMap = mutableMapOf<Char,Int>()   
     val tMap = mutableMapOf<Char,Int>() 
     for(i in s.indices){
        sMap[s[i]]= sMap.getOrDefault(s[i],0) + 1
        tMap[t[i]]= tMap.getOrDefault(t[i],0) + 1
     }
     for ((char,count) in sMap){
        if (tMap.getOrDefault(char,0) != count){
            return false
        }
     }
     return true
    }
}