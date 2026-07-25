class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>> map = new HashMap<>();

    for (String s : strs){
        char[] chr = s.toCharArray();
        Arrays.sort(chr);
        String l = new String(chr);
        map.putIfAbsent(l,new ArrayList<>());
        map.get(l).add(s);
    
    }
    return new ArrayList<>(map.values());
}
}
