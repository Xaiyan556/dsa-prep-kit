public class Subarrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
		int ts=0;//counter
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;//counter to calculate total subarrrays
                System.out.println();
            }
            System.out.println();
        }System.out.print(ts);
    }
}