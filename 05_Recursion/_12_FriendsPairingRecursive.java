public class FriendsPairingRecursive {

    public static int countWays(int n) {
        // Base cases
        if (n <= 1) return 1;

        // Single choice ways
        int single = countWays(n - 1);

        // Pair choice ways
        int pair = (n - 1) * countWays(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways: " + countWays(n));
    }
}