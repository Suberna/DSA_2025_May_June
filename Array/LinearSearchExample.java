/*
 🔍 What is Linear Search?
Linear Search (or sequential search) is the simplest method to find an element in a list or array.
It checks each element one by one until it finds the target element or reaches the end.

✅ Key Concepts
Go through the array from start to end.
Compare each element with the target.
If a match is found, return the index.
If the loop ends without finding it, return -1 (meaning not found).

🧠 Logic in Simple Steps
Take an array and a target number to search.
Loop from the first to the last element.
In each step:
If the current element equals the target → return the index.
If you finish the loop without finding it → return -1.
 */

package Array;

public class LinearSearchExample {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
