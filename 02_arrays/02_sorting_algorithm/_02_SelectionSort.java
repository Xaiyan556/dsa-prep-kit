public class _02_SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;//let current element as minmum

            // Find minimum in unsorted part
            for (int j = i + 1; j < n; j++) {
                if ( arr[minIndex] > arr[j] ) {
                    minIndex = j;// assigning new minindex 
                }
            }

            // Swap only if needed
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Before: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("After:  ");
        printArray(arr);
    }
}