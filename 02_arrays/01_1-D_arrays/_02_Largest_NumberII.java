public class Main {

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;//- infinity

        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5};

        System.out.println(findMax(arr)); // Output: 6
    }
}