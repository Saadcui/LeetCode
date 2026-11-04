
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            // Count frequency of each character
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // Create unique key based on character frequency
            StringBuilder key = new StringBuilder();

            for (int num : count) {
                key.append('#').append(num);
            }

            // Group anagrams together
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
