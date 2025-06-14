Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 
class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char c:magazine.toCharArray())
            freq[c - 'a']++;
        for(char c : ransomNote.toCharArray()){
            if(freq[c - 'a'] == 0)
               return false;
            else 
               freq[c - 'a']--;   
        }
        return true;
    }
}
