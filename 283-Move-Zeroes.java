class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=1;
        while(r <nums.length){
            if(nums[l]==0){
                if(nums[r]!=0){
                    nums[l]=nums[r];
                    nums[r]=0;
                    l++;
                }
            }else{
                    l++;
                }
            r++;
        }
        
    }
}