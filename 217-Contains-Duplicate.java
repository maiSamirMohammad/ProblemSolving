class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int n : nums) {
            if (hashset.contains(n)) {
                return true;
            }
            hashset.add(n);
        }
        return false;
    }
}
