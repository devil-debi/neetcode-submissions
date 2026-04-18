class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int i : nums){
            if (numsSet.contains(i)){
                return true;
            }else{
                numsSet.add(i);
            }
        }

        return false;
    }
}