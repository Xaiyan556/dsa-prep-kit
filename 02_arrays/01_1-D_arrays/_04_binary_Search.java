static int binarySearch(int[] arr, int key) {

    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {

        int mid = start + (end - start) / 2;

        if(arr[mid] == key) {
            return mid;   // FOUND
        }
        else if(arr[mid] > key) {
            end = mid - 1;   // LEFT
        }
        else {
            start = mid + 1; // RIGHT
        }
    }

    return -1; // not found
}