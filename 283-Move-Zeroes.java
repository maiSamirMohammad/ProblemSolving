class Solution {
    public void moveZeroes(int[] nums) {
        int p2=0;
        int p1=1;
        while(p1 <nums.length){
            if(nums[p2]==0){
                if(nums[p1]!=0){
                    nums[p2]=nums[p1];
                    nums[p1]=0;
                    p2++;
                }
            }else{
                    p2++;
                }
            p1++;
        }
        
    }
}