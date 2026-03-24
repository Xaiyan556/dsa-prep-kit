public class _01_LinearSearch {

    static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;  // found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        int result = linearSearch(arr, 10);

        System.out.println(result); // Output: 4
    }
}