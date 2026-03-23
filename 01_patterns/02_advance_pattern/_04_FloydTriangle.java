public class FloydTriangle {

    public static void main(String[] args) {

        int n = 5;
        int number = 1;//counter
		//outer loop
        for(int i = 1; i <= n; i++) {
			//inner loop
            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;//update counter
            }

            System.out.println();//next line
        }
    }
}