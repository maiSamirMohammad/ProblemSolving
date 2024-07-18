class Solution {
    public int removeDuplicates(int[] nums) {
        // Check for edge cases.
  if (nums == null) {
      return 0;
  }
        int l=1;
        for(int r=1 ; r< nums.length ; r++ ){
            if(nums[r] != nums[r-1]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}