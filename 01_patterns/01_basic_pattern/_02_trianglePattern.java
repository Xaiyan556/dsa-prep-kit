public class _02_trianglePattern {
    public static void main(String[] args) {

        int n = 4;   // number of rows

        for(int i = 1; i <= n; i++) {      // outer loop → rows
            
            for(int j = 1; j <= i; j++) {  // inner loop → stars
                System.out.print("* ");
            }

            System.out.println(); // move to next line
        }
    }
}