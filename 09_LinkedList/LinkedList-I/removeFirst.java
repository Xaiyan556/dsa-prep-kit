// Complete Linked List with removeFirst (returns value)

public class LinkedList {

    // 🔹 Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size = 0;

    // 🔹 Add at beginning
    void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        if (tail == null) { // empty list
            tail = newNode;
        }

        size++;
    }

    // 🔹 Add at end
    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) { // empty list
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;

        size++;
    }

    // 🔹 Remove first (returns deleted value)
    int removeFirst() {

        // Case 1: empty list
        if (head == null) {//size=0
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        // store value
        int val = head.data;

        // Case 2: single node
        if (head == tail) {//size=1
            head = tail = null;
        } 
        else {
            // Case 3: multiple nodes
            head = head.next;
        }

        size--; // update size

        return val; // return removed value
    }

    // 🔹 Print list
    void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 🔹 Get size
    int getSize() {
        return size;
    }

    // 🔹 Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // add elements
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(30);

        list.printList(); // 5 -> 10 -> 20 -> 30 -> null

        // remove first
        int removed = list.removeFirst();
        System.out.println("Removed: " + removed);

        list.printList(); // 10 -> 20 -> 30 -> null
        System.out.println("Size: " + list.getSize());
    }
}