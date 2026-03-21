public class _01_hollowRectangle {

    static void printRectangle(int rows, int cols) {
    //outer loop
        for (int i = 1; i <= rows; i++) {
        //inner loop
            for (int j = 1; j <= cols; j++) {
		//cell- (i,j)
                if (i == 1 || i == rows || j == 1 || j == cols)//boundary conditions
                    System.out.print("* ");//print star
                else//not boundary
                    System.out.print("  ");//space

            }
            System.out.println();//next line
        }
    }

    public static void main(String[] args) {
        printRectangle(5, 6);
    }
}