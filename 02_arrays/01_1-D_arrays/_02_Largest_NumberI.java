
public class _02_Largest_NumberI {

    static int findMax(int[] arr) {

        int max = arr[0];  // assume first element is largest

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5};

        System.out.println(findMax(arr)); // Output: 6
    }
}