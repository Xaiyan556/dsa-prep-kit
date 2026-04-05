import java.util.*;

public class PairSumBruteForce {

    public static boolean hasPair(ArrayList<Integer> list, int target) {
        int n = list.size();

        // Outer loop selects first element
        for (int i = 0; i < n; i++) {

            // Inner loop selects second element
            for (int j = i + 1; j < n; j++) {

                int sum = list.get(i) + list.get(j);

                // Check if pair matches target
                if (sum == target) {
                    return true; // pair found
                }
            }
        }

        return false; // no pair found
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int target = 5;

        System.out.println(hasPair(list, target)); // true
    }
}