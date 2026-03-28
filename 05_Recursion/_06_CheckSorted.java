public class CheckSorted {

    static boolean isSorted(int[] arr, int index) {
        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        // If current pair is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean result = isSorted(arr, 0);

        if (result) {
            System.out.println("Array is sorted ✅");
        } else {
            System.out.println("Array is NOT sorted ❌");
        }
    }
}