class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        ArrayList<Integer>[] count = new ArrayList[nums.length+1];

        for (int i = 0; i <= nums.length; i++) {
            count[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> element :  map.entrySet()){
            count[element.getValue()].add(element.getKey());
        }
        int [] result = new int[k];
        int j =0;
        for(int i = count.length-1;i>=0;i--){

            for(int x : count[i]){
                result[j++]=x;
                if (j == k){
                    return result;
                }
            }
            System.out.println(count[i]);
        }
        return result;

    }
}
