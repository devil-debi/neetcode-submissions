class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    //     Map<Integer,Integer> map = new HashMap<>();
    //     List<int[]> list = new ArrayList<>();

    //     for(int i : nums){
    //         map.put(i,map.getOrDefault(i,0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //         list.add(new int[]{entry.getKey(),entry.getValue()});
    //     }
    //     list.sort((a,b)->b[1]-a[1]);
    //     int[] res = new int[k];
    //     for (int i = 0;i<k;i++){
    //             res[i]=list.get(i)[0];
    //     }

    //    return res;

    Map<Integer,Integer> map = new HashMap<>();
    for(int i : nums){

        map.put(i,map.getOrDefault(i,0)+1);
    }
    List<Integer>[] freq = new List[nums.length+1];

    for(int i = 0 ;i<freq.length ;i++){
            freq[i] = new ArrayList<>();
    }
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        freq[entry.getValue()].add(entry.getKey());
    }

    int[] res = new int[k];
    int index = 0;

    for (int i  = freq.length -1 ;i>0&&index < k;i--){
        for (int j : freq[i]){
            res[index++] = j;
        }
    }
    return res;
    }
}
