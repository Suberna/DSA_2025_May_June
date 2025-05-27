public class ValidParenthesis {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (level > 0) {
                    result.append(c);
                }
                level++;
            } else if (c == ')') {
                level--;
                if (level > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
