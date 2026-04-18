class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    //     List<List<String>> result = new ArrayList<>();
    //     Map<String,List<String>> stringMap = new HashMap<>();
    //     for (String s : strs){
    //         char [] charArray = s.toCharArray();
    //         Arrays.sort(charArray);
    //         String key = new String(charArray);

    //         if (!stringMap.containsKey(key)){
    //             stringMap.put(key, new ArrayList<>(){});
    //         }
    //         stringMap.get(key).add(s);
            
    //     }
    //     //stringMap.forEach((key, value) -> System.out.println(key + " " + value));

    //     result.addAll(stringMap.values());

    // return result;

    List<List<String>> result = new ArrayList<>();

    Map<String,List<String>> stringMap = new HashMap<>();
    for (String s : strs){
        int[] charArray = new int[26];
        for(char c: s.toCharArray()){
            charArray[c-'a']++;
        }
        String key = Arrays.toString(charArray);
        stringMap.putIfAbsent(key, new ArrayList<>());
        stringMap.get(key).add(s);
    }
    result.addAll(stringMap.values());
    return result;

    }
}
