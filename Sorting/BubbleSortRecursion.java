//with recursion
/** 
 ✅ 🧠 Logic (Recursive Bubble Sort):
Bubble sort works by:

Comparing adjacent elements and swapping if needed.

Pushing the largest element to the end in one pass.

In recursion:

Perform one pass (like in normal bubble sort).

Then recursively sort the first n-1 elements
*/

public class RecursiveBubbleSort {
    // Recursive function to perform bubble sort
    public static void bubbleSort(int[] arr, int n) {
        // Base case: If size is 1, return
        if (n == 1) {
            return;
        }

        // One pass to push the largest element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for the rest of the array
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};

        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers, numbers.length);

        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
