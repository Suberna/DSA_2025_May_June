public class StringShiftChecker {
    public static boolean canShiftToGoal(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubleS = s + s;
        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println(canShiftToGoal(s1, goal1)); // true

        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println(canShiftToGoal(s2, goal2)); // false
    }
}
