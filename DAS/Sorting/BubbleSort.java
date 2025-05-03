//without recursion

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for pairwise comparison
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers);

        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
