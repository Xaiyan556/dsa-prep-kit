public class _03_Smallest_number {

    static int findMin(int[] arr) {

        if(arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = Integer.MAX_VALUE;

        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5};

        System.out.println(findMin(arr)); // Output: 1
    }
}