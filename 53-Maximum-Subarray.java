class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0){
            return 0;
        }
        if (n == 1){
            return nums[0];
        }
        int curSum=0;
        int largestSum = nums[0];
        for (int i = 0; i < n; i++){
            curSum = (curSum > 0 ?curSum:0) + nums[i];
            largestSum= Math.max(largestSum, curSum);
        }
            return largestSum;
    }
    
}