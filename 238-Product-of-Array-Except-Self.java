class Solution {
    public int[] productExceptSelf(int[] nums) {         
      int n= nums.length;                                                   
      int[] answer = new int[n];
      int[] prefix = new int[n];
      int[] suffix = new int[n];
      for (int i = 0; i < n; i++) {
            answer[i] = 1;
            prefix[i] = 1;
            suffix[i] = 1;
        }
        //fill prefix
      for (int i = 0; i < n; i++){
        prefix[i] = (i > 0 ?prefix[i-1]:1)*nums[i];
      }
       //fill suffix
      for (int i = n-1; i >=0; i--){
        suffix[i] = (i < n-1 ?suffix[i+1]:1)*nums[i];
      }
      for(int i=0; i<n; i++){
        if (i > 0){
            answer[i]*= prefix[i-1];
        }
        if (i<n-1){
            answer[i]*= suffix[i+1];
        }
      }
        return answer;
    }
}