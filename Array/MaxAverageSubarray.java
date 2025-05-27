package Array;
/*Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75 */
public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first k elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // This is our initial max sum
        double maxSum = sum;

        // Step 2: Slide the window through the array
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; // Slide the window
            maxSum = Math.max(maxSum, sum);    // Keep the max sum
        }

        // Step 3: Return the average
        return maxSum / k;
    }
