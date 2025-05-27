package Array;
/*✅ Problem Summary:
You're given an array nums[] of length n, which contains all numbers from 0 to n, except one missing number.
Your job is to find the missing number.

🧠 Simple Logic (Using Sum Formula):
All numbers from 0 to n should add up to:
total = n * (n + 1) / 2
If you subtract the sum of elements in the array from this total, you get the missing number.

💡 Why This Works?
The array has n elements, but the full range is [0, n], which includes n+1 numbers.
By calculating the expected total and subtracting the actual total, you get the missing one. */

public class MissingNumberFinder {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return total - sum;
    }
}

