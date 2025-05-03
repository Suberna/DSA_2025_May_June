//with recursion

public class RecursiveInsertionSort {

    // Recursive insertion sort function
    public static void insertionSort(int[] arr, int n) {
        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSort(arr, n - 1);

        // Insert last element at its correct position
        int last = arr[n - 1];
        int j = n - 2;

        // Move elements that are greater than 'last' one position ahead
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};

        System.out.println("Before sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        insertionSort(arr, arr.length);

        System.out.println("\nAfter sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
