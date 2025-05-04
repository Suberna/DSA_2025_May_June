/*2. Recursive Binary Search in Java
✅ Logic
Base Case:
If low > high → element not found → return -1.

Find mid = (low + high) / 2.

If arr[mid] == target → return mid.

If arr[mid] < target → search right half (mid + 1 to high).

If arr[mid] > target → search left half (low to mid - 1). */

package Array;

public class RecursiveBinarySearch {
    // Recursive method
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; // Element not found
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target); // Search right
        } else {
            return binarySearch(arr, low, mid - 1, target); // Search left
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Must be sorted
        int target = 40;

        int result = binarySearch(numbers, 0, numbers.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}

