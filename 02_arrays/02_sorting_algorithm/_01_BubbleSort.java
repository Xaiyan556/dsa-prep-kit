public class _01_BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        //i= turns/pass
        for (int i = 0; i < n - 1; i++) {
            // Flag to check if swapping happens
            boolean swapped = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true;
                }
            }
            
            // If no swaps → array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}