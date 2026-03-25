public class _03_InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {//i= current element
            int key = arr[i];   // pick element to insert from unsorted part
            int j = i - 1;//j=prev element

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            //j decreases 

            // Place key at correct position in sorted part
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};

        System.out.print("Before: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("After:  ");
        printArray(arr);
    }
}