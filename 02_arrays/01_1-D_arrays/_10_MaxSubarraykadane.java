public class _10_MaxSubarraykadane {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        int maxSum = Integer.MIN_VALUE;//-infinity
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }
}