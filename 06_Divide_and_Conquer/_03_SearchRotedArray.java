class _03_SearchRotatedArray {

    public static int search(int[] arr, int target, int si, int ei) {

        // Base case: not found
        if (si > ei) return -1;

        int mid = si + (ei - si) / 2;

        // Found target
        if (arr[mid] == target) return mid;

        // Case 1: Left half is sorted
        if (arr[si] <= arr[mid]) {

            // Target lies in left half
            if (target >= arr[si] && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // Otherwise, search right half
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        // Case 2: Right half is sorted
        else {

            // Target lies in right half
            if (target >= arr[mid] && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // Otherwise, search left
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(arr, target, 0, arr.length - 1);

        System.out.println("Index: " + result);
    }
}