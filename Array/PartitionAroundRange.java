package Array;
/*Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true. */
public class PartitionAroundRange {
    public static boolean threeWayPartition(int[] arr, int a, int b) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                // Swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] >= a && arr[mid] <= b) {
                mid++;
            } else {
                // arr[mid] > b
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return true;
    }

    // Utility to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Test the function
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 4};
        int a1 = 1, b1 = 2;
        if (threeWayPartition(arr1, a1, b1)) {
            System.out.println("Output: true");
            printArray(arr1);
        }

        int[] arr2 = {1, 4, 3, 6, 2, 1};
        int a2 = 1, b2 = 3;
        if (threeWayPartition(arr2, a2, b2)) {
            System.out.println("Output: true");
            printArray(arr2);
        }
    }
}

