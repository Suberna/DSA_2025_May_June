public class LargestOddNumber {
    public String largestOddNumber(String num) {
        // Start from the last character
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {  // Check if digit is odd
                return num.substring(0, i + 1);
            }
        }
        return "";  // No odd digit found
    }
}

