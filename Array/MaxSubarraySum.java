package Array;
/*Examples:
Input: arr[] = [100, 200, 300, 400] , k = 2
Output: 700
Explanation: arr3  + arr4 = 700, which is maximum. */

public public class MaxSubarraySum {
    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Invalid input");
            return -1;
        }

        // Step 1: Calculate the sum of the first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 200, 300, 400};
        System.out.println(maxSum(arr1, 2)); // Output: 700

        System.out.println(maxSum(arr1, 4)); // Output: 1000

        System.out.println(maxSum(arr1, 1)); // Output: 400
    }
}
 {
    
}
