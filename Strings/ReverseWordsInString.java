package Strings;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        // Step 1: Trim leading/trailing spaces
        s = s.trim();

        // Step 2: Split words by one or more spaces (regex)
        String[] words = s.split("\\s+");

        // Step 3: Use StringBuilder to build reversed result
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");  // add space between words
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString solution = new ReverseWordsInString();

        System.out.println(solution.reverseWords("the sky is blue"));      // Output: "blue is sky the"
        System.out.println(solution.reverseWords("  hello world  "));      // Output: "world hello"
        System.out.println(solution.reverseWords("a good   example"));     // Output: "example good a"
    }
}

