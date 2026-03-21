public class _02_InvertedRotatedHalfPyramid {

    public static void main(String[] args) {

        int n = 4;
		//rows
        for(int i = 1; i <= n; i++) {
            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}