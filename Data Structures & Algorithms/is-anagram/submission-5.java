class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> characterMap = new HashMap<>();

        for (int i  = 0 ;i < s.length();i++){
            characterMap.put(s.charAt(i),  characterMap.getOrDefault(s.charAt(i), 0)+1);
            characterMap.put(t.charAt(i),  characterMap.getOrDefault(t.charAt(i), 0)-1);
        }

        for (Map.Entry<Character,Integer> element : characterMap.entrySet()){
            if(element.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
