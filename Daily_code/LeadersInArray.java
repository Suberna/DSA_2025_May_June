/*Examples:
Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2. */
import java.util.*;
public class LeadersInArray {
    public List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];

        leaders.add(maxFromRight); // last element is always a leader

        // Traverse from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Reverse the list to maintain left to right order
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        LeadersInArray sol = new LeadersInArray();

        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> result = sol.findLeaders(arr);

        System.out.println("Leaders in the array: " + result);
    }
}
