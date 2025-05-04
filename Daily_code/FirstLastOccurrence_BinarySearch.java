/*✅ Simple Logic:
We want to find the first and last positions of a number x in a sorted array arr[] (which may contain duplicates).

Steps:
Use binary search to find the first occurrence:

When arr[mid] == x, store the index.

But keep searching left (high = mid - 1) to find the earliest index.

Use binary search again to find the last occurrence:

When arr[mid] == x, store the index.

But keep searching right (low = mid + 1) to find the latest index.

If not found, return [-1, -1].

 */

 import java.util.ArrayList;

class FirstAndLastFinder {

    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int first = -1;
        int last = -1;

        // Find first occurrence
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1; // keep searching left
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1; // keep searching right
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        result.add(first);
        result.add(last);
        return result;
    }
}

/*public class FirstAndLastOccurrence {

    public static int[] findFirstAndLast(int[] arr, int x) {
        int[] result = {-1, -1};

        // First Occurrence
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result[0] = mid;
                high = mid - 1; // keep searching left
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Last Occurrence
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result[1] = mid;
                low = mid + 1; // keep searching right
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
 */