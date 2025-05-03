public class MergeSort {

    // Main function to sort an array using Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Step 1: Find the middle point
            int mid = (left + right) / 2;

            // Step 2: Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Step 3: Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temporary arrays

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    // Driver code to test the sort
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

/*Key Concepts from Picture Logic:

Split the array recursively into halves (Divide).

Sort each half recursively (Conquer).

Merge two sorted halves (Merge).
*/