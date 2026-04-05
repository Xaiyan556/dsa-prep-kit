import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Assume first element is max
        int max = list.get(0);

        // Traverse list
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i); // update max
            }
        }

        System.out.println("Maximum = " + max); // 9
    }
}