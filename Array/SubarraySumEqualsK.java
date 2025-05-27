package Array;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int countSubarraysWithSum(int[] arr, int k) {
        // Map to store prefix sums and their frequencies
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int count = 0;
        int prefixSum = 0;

        // Add initial prefixSum = 0
        prefixSumCount.put(0, 1);

        for (int num : arr) {
            prefixSum += num;

            // Check if there is a prefixSum that satisfies the condition
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }

            // Add/update current prefixSum in the map
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 2, -2, -20, 10};
        int k1 = -10;
        System.out.println("Output: " + countSubarraysWithSum(arr1, k1));  // Output: 3

        int[] arr2 = {1, 4, 20, 3, 10, 5};
        int k2 = 33;
        System.out.println("Output: " + countSubarraysWithSum(arr2, k2));  // Output: 1
    }
}

