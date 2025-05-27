package Strings;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // Step 1: Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create count array for 26 lowercase letters
        int[] count = new int[26];

        // Step 3: Process both strings
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // increment for s
            count[t.charAt(i) - 'a']--;  // decrement for t
        }

        // Step 4: Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));  // Output: true

        String s3 = "rat";
        String s4 = "car";
        System.out.println(isAnagram(s3, s4));  // Output: false
    }
}


