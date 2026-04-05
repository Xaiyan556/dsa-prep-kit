import java.util.ArrayList;

public class BasicOperation {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");   // index 0
        list.add("Banana");  // index 1

        // Get element
        System.out.println(list.get(0)); // Apple

        // Set element
        list.set(1, "Mango"); // Banana → Mango

        // Check existence
        System.out.println(list.contains("Mango")); // true

        // Remove element
        list.remove(0); // removes Apple

        // Print final list
        System.out.println(list); // [Mango]
    }
}