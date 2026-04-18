class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> twoSumMap = new HashMap<>();
        for (int i = 0 ; i< nums.length;i++){

            if (twoSumMap.containsKey(nums[i])){
                return new int []{twoSumMap.get(nums[i]),i};
            }else{
                twoSumMap.put(target-nums[i],i);
            }

        }
        return new int []{-1,-1};
    }
}
