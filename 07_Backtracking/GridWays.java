public class GridWays {
    static int countWays(int i, int j, int n, int m) {
        // 🎯 base case (destination reached)
        if (i == n-1 && j == m-1) {
            return 1;
        }

        // ❌ out of bounds//corner case(base case)
        if (i >= n || j >= m) {
            return 0;
        }

        // ⬇️ move down + ➡️ move right
        int down = countWays(i + 1, j, n, m);//way 1
        int right = countWays(i, j + 1, n, m);//way 2

        return down + right;//total ways
    }
    
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Number of ways to reach destination: " + countWays(0, 0, n, m));
    }
}