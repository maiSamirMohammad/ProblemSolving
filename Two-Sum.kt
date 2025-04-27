class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val myList = mutableListOf<Int>()
        
        // Classic for loop for index1
        for (index1 in nums.indices) {
            // Classic for loop for index2, starting from index1 + 1
            for (index2 in index1 + 1 until nums.size) {
                if (nums[index1] + nums[index2] == target) {
                    myList.add(index1)
                    myList.add(index2)
                    break
                }
            }
        }
        
        return myList.toIntArray()
    }
}
