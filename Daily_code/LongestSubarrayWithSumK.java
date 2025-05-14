import java.util.HashMap;

public class LongestSubarrayWithSumK {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from index 0 to i
            if (sum == k) {
                maxLength = i + 1;
            }

            // Case 2: check if (sum - k) has been seen
            if (prefixSumMap.containsKey(sum - k)) {
                int prevIndex = prefixSumMap.get(sum - k);
                int currentLength = i - prevIndex;
                maxLength = Math.max(maxLength, currentLength);
            }

            // Store first occurrence of this prefix sum
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println("Longest subarray length with sum " + k + " is: " + longestSubarrayWithSumK(arr, k));
    }
}
