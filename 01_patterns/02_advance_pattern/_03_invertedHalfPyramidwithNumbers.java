public class _03_invertedHalfPyramidwithNumbers {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop to handle the number of rows
        for(int i = 1; i <= n; i++) {
            // Inner loop to handle the number of columns
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}