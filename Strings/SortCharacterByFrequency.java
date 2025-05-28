import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
    public static String frequencySort(String s) {
        // Step 1: Count frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Sort characters by frequency
        List<Character> charList = new ArrayList<>(freqMap.keySet());
        charList.sort((a, b) -> freqMap.get(b) - freqMap.get(a));  // descending

        // Step 3: Build result string
        StringBuilder result = new StringBuilder();
        for (char c : charList) {
            int count = freqMap.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));    // eert or eetr
        System.out.println(frequencySort("cccaaa"));  // cccaaa or aaaccc
        System.out.println(frequencySort("Aabb"));    // bbAa or bbaA
    }
}
