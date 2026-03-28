public class FirstOccurrence {

    static int firstOcc(int[] arr, int index, int key) {
        // Base case: reached end
        if (index == arr.length) {
            return -1;//invalid index
        }

        // If found at current index
        if (arr[index] == key) {
            return index;
        }

        // Recursive call
        return firstOcc(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 95;

        int result = firstOcc(arr, 0, key);

        System.out.println("First occurrence index: " + result);
    }
}