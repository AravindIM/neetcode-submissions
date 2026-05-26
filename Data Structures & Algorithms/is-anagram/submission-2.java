class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        char sCharacter;
        char tCharacter;

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            sCharacter = s.charAt(i);
            tCharacter = t.charAt(i);
            sMap.put(sCharacter, sMap.getOrDefault(sCharacter, 0) + 1);
            tMap.put(tCharacter, tMap.getOrDefault(tCharacter, 0) + 1);
        }
        for (Character key : sMap.keySet()) {
            if (!sMap.get(key).equals(tMap.getOrDefault(key, 0))) {
                return false;
            }
        }
        for (Character key : tMap.keySet()) {
            if (!sMap.containsKey(key)) {
                return false;
            }
        }
        return true;
    }
}
