class _01_MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) return;//base case

        int mid = si + (ei - si) / 2;

        // Divide
        mergeSort(arr, si, mid);//1st part (left)
        mergeSort(arr, mid + 1, ei);//later part (right)

        // Conquer (merge)
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // leftindex (0,3)=> 4 elements = si-ei+1 =3-0+1 =4 size
        int temp[] = new int[ei - si + 1];

        int i = si;       // left part iterator
        int j = mid + 1; // right part iterator
        int k = 0;       // iterator for temp array
		//comparing first i.e smallest element from both array
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
            //post increment operator
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // for remaining element in any of the array 
        //due to and & previous loop is stoppeed

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= ei) temp[k++] = arr[j++];

        // copy back temp array to original
        for (k = 0;  k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }
}