public class _05_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
        //swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
		//print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}