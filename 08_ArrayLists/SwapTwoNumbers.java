import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1;
        int idx2 = 3;

        // Step 1: store one value temporarily
        int temp = list.get(idx1);

        // Step 2: replace idx1 with idx2 value
        list.set(idx1, list.get(idx2));

        // Step 3: replace idx2 with temp
        list.set(idx2, temp);

        System.out.println(list); // [2, 3, 9, 5, 6]
    }
}