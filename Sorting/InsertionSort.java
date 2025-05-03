//without recursion

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];         // Current element to be inserted
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;  // Insert the key at correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};

        System.out.println("Before sorting:");
        for (int num : arr) System.out.print(num + " ");

        insertionSort(arr);

        System.out.println("\nAfter sorting:");
        for (int num : arr) System.out.print(num + " ");
    }
}
