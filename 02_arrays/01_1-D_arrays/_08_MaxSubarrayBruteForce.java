public class MaxSubarrayBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;

        // generate all subarrays
        for (int i = 0; i < n; i++) {          // start
            for (int j = i; j < n; j++) {      // end
                int sum = 0;

                for (int k = i; k <= j; k++) { // calculate sum
                    sum += arr[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Max Subarray Sum = " + maxSum);
    }
}