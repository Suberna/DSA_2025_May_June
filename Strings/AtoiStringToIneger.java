public class AtoiStringToIneger {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;

        // Handle sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Clamp if overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) result * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));               // 42
        System.out.println(myAtoi("   -042"));         // -42
        System.out.println(myAtoi("1337c0d3"));        // 1337
        System.out.println(myAtoi("0-1"));             // 0
        System.out.println(myAtoi("words and 987"));   // 0
    }
}
