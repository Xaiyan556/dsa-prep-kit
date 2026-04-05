import java.util.ArrayList;

public class ConvertTo2DArray {
    public static void main(String[] args) {

        // Sample multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= 5; j++) {
                temp.add(i * j); // filling values
            }
            lists.add(temp);
        }

        // Step 1: Define 2D array with correct size
        int rows = lists.size();                  // number of lists
        int cols = lists.get(0).size();           // size of first inner list

        int[][] arr = new int[rows][cols];

        // Step 2: Copy elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = lists.get(i).get(j);  // transfer data
            }
        }

        // Step 3: Print 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}