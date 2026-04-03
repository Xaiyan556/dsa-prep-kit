import java.util.*;

class _02_QuickSort {

    // Main quicksort function
    public static void quickSort(int[] arr, int si, int ei) {

        // Base case: if subarray has 0 or 1 element, it's already sorted
        if (si >= ei) return;

        // Partition the array and get pivot index
        int pivotIndex = partition(arr, si, ei);

        // Recursively sort left part (elements smaller than pivot)
        quickSort(arr, si, pivotIndex - 1);

        // Recursively sort right part (elements greater than pivot)
        quickSort(arr, pivotIndex + 1, ei);
    }

    // Partition function (Lomuto partition scheme)
    private static int partition(int[] arr, int si, int ei) {

        // Choose last element as pivot
        int pivot = arr[ei];

        // 'i' tracks the boundary of elements <= pivot
        int i = si - 1;

        // Traverse array from si to ei-1
        for (int j = si; j < ei; j++) {

            // If current element is <= pivot
            if (arr[j] <= pivot) {

                i++; // expand boundary of smaller elements

                // Swap current element with element at boundary
                swap(arr, i, j);
            }
        }

        // Place pivot in its correct sorted position
        swap(arr, i + 1, ei);

        // Return pivot index
        return i + 1;
    }

    // Utility function to swap two elements
    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Driver function
    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 8, 2, 5};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        // Initial call: full array
        quickSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}