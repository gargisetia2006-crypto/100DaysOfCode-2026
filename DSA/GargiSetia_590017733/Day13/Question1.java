import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        HashMap<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        String ans = "";
        int maxFreq = 0;

        for (String word : words) {

            if (word.length() == 0 || bannedSet.contains(word))
                continue;

            map.put(word, map.getOrDefault(word, 0) + 1);

            if (map.get(word) > maxFreq) {
                maxFreq = map.get(word);
                ans = word;
            }
        }

        return ans;
    }
}