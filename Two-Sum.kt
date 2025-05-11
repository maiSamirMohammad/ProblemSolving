class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map= mutableMapOf<Int,Int>()
        for (i in nums.indices){
            val complement= target - nums[i]
            if(map.containsKey(complement)){
                return intArrayOf(map[complement]!!,i)
            }
            map[nums[i]]=i
        }
        return intArrayOf(-1,-1)
    }
}