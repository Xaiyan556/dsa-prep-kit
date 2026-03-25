public class _06_PairsInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
		int tp=0;//count total pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                tp++;//counter
            }
        }
    }
    System.out.println(tp);//total no. of pairs
}