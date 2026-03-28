public class _10_TilingProblemRecursive {

    public static int countWays(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // Recursive relation
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways: " + countWays(n));
    }
}