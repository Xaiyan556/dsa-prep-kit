public class MaxSubarrayPrefix {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int n = arr.length;

        // Step 1: create prefix array
        int[] prefix = new int[n];
        prefix[0] = arr[0];//ist element is same

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Step 2: generate subarrays using i, j
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int currSum;

                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Subarray Sum = " + maxSum);
    }
}