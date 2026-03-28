public class LastOccurrence {

    static int lastOcc(int[] arr, int index, int key) {
        // Base case
        if (index == arr.length) {
            return -1;
        }

        // Step 1: check in rest of array
        int isFoundInRest = lastOcc(arr, index + 1, key);

        // Step 2: if found later, return that
        if (isFoundInRest != -1) {
            return isFoundInRest;
        }

        // Step 3: check current index
        if (arr[index] == key) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;

        int result = lastOcc(arr, 0, key);

        System.out.println("Last occurrence index: " + result);
    }
}