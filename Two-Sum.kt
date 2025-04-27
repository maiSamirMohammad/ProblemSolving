class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val myList = mutableListOf<Int>()
        for (index1 in nums.indices) {
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