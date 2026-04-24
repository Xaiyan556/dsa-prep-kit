import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Add at beginning
        list.addFirst(5);

        // Add at end
        list.addLast(40);

        System.out.println(list);

        // Remove elements
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        // Access
        System.out.println("Element at index 1: " + list.get(1));
    }
}