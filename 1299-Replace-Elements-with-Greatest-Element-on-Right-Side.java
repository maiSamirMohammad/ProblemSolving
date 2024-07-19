class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr==null){
            return null;
        }
        
        int max_right_value= arr[arr.length-1];
        int temp;
        arr[arr.length-1]= -1;
        
        for(int i= arr.length-2; i>=0 ; i--){
            temp= arr[i];
            arr[i]= max_right_value;
            if (temp > max_right_value){
                max_right_value= temp;
            }
        }

        return arr;
    }
}