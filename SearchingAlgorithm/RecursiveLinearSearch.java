/*1. Recursive Linear Search in Java
✅ Logic
Base Case:
If index ≥ array length → element not found → return -1.

If arr[index] == target → return index.

Otherwise, call the function with index + 1. */

package SearchingAlgorithm;

public class RecursiveLinearSearch {
    // Recursive method
    public static int linearSearch(int[] arr, int index, int target) {
        if (index >= arr.length) {
            return -1; // Element not found
        }
        if (arr[index] == target) {
            return index; // Element found
        }
        return linearSearch(arr, index + 1, target); // Search in the rest
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;

        int result = linearSearch(numbers, 0, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}

