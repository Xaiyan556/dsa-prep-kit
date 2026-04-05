import java.util.*;

public class PairSumTwoPointer {

    public static boolean hasPair(ArrayList<Integer> list, int target) {
        int left = 0; // start pointer
        int right = list.size() - 1; // end pointer

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true; // pair found
            } else if (sum < target) {
                left++; // increase sum
                //look for big left number
            } else {
                right--; // decrease sum
                // look for small right number
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