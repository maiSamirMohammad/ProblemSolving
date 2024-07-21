class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer , Integer> map= new HashMap();
        for (int i=0; i< arr.length; i++){
            map.put(arr[i],i);
        }
        for (int i=0 ; i< arr.length ; i++){
            if (map.containsKey(2*arr[i]) && i != map.get(2*arr[i])){
                return true;
            }
        }
        return false;    
    }
}