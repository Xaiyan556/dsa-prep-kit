public class _04_HalfPyramidNumbers {

    public static void main(String[] args) {

        int n = 4; // number of rows

        for(int i = 1; i <= n; i++) {      // outer loop → rows
            
            for(int j = 1; j <= i; j++) {  // inner loop → numbers
                System.out.print(j);
            }

            System.out.println(); // move to next row
        }
    }
}