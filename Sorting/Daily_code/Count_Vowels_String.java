/*✅ Logic:
Convert the string to lowercase (to handle both uppercase and lowercase vowels).

Loop through each character of the string.

Check if the character is a vowel (a, e, i, o, u).

If yes, increment the vowel count.

 */

 import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); // Convert to lowercase

        int vowelCount = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Print result
        System.out.println("Number of vowels: " + vowelCount);

        sc.close();
    }
}
/*
 class Solution {
    int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}

 */