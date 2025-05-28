public class MaxNestingDepth {
    public static int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));  // Output: 3
        System.out.println(maxDepth("(1)+((2))+(((3)))"));    // Output: 3
        System.out.println(maxDepth("()(())((()()))"));       // Output: 3
    }
}
