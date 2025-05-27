/*Binary Search to find the first occurrence (smallest index) of an element k in a sorted array.

✅ 🔍 Key Points:
We're using a modified binary search.
If arr[mid] == k, don't stop immediately.
Instead, store the index and keep searching the left half to check for earlier occurrence.
This ensures we find the smallest index if duplicates exist. */

package Array;

public class FirstOccurrenceBinarySearch {

    public static int findFirstOccurrence(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1; // Store the index of first occurrence

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                result = mid;      // Found k, but check for earlier occurrence
                high = mid - 1;    // Move left to find smaller index
            } else if (arr[mid] < k) {
                low = mid + 1;     // Search in right half
            } else {
                high = mid - 1;    // Search in left half
            }
        }

        return result; // Returns -1 if not found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {11, 22, 33, 44, 55};
        int[] arr3 = {1, 1, 1, 1, 2};

        System.out.println(findFirstOccurrence(arr1, 4));   // Output: 3
        System.out.println(findFirstOccurrence(arr2, 445)); // Output: -1
        System.out.println(findFirstOccurrence(arr3, 1));   // Output: 0
    }
}

