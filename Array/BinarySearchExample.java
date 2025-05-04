/*
 🔍 What is Binary Search?
Binary Search is an efficient algorithm to find an element in a sorted array.
It works by repeatedly dividing the search range in half.

✅ Key Concepts
Works only on sorted arrays (ascending or descending).
Much faster than linear search — cuts the array in half each time.
Compares the middle element with the target.
If target is:
Equal to mid → found!
Less than mid → search in the left half.
Greater than mid → search in the right half.

🧠 Logic in Simple Steps
Start with two pointers: low = 0, high = array.length - 1.
While low <= high:
Find the middle: mid = (low + high) / 2.
If arr[mid] == target → return mid.
If arr[mid] < target → search right: low = mid + 1.
If arr[mid] > target → search left: high = mid - 1.
If not found → return -1.
 */

package Array;

public class BinarySearchExample {
    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // MUST be sorted
        int target = 30;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

