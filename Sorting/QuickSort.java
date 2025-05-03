/*Quick Sort is a popular sorting algorithm that follows the Divide and Conquer strategy. It’s faster than many other sorting methods like bubble sort or insertion sort for large datasets.

📌 Key Points to Remember
Divide and Conquer: It breaks the big problem into smaller parts, solves them, and combines the results.
Pivot Element: Quick sort chooses one element as a pivot and then arranges the array so:
All elements smaller than pivot go to the left
All elements greater than pivot go to the right

Recursive: After placing the pivot in its correct position, it recursively sorts the left and right sub-arrays.
In-place Sort: Doesn’t require extra space like merge sort. It sorts in the same array.
Time Complexity:
Best case: O(n log n)
Worst case: O(n²) (when the pivot is the smallest or largest element every time)
Average case: O(n log n)
✅ Simple Example
Let's sort this array:
 arr = [5, 3, 8, 4, 2]
Steps:
Choose a pivot (say 5)
Rearrange:
Left of pivot (less than 5): [3, 4, 2]
Pivot: 5
Right of pivot (greater than 5): [8]
Repeat the same for [3, 4, 2] and [8] recursively.
Final sorted: [2, 3, 4, 5, 8]
*/
//✅ Java Code for Quick Sort

public class QuickSortExample {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            
            quickSort(arr, low, pivotIndex - 1);  // left part
            quickSort(arr, pivotIndex + 1, high); // right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot to correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


