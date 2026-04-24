public class LinkedList {

    // Node class (basic building block)
    static class Node {
        int data;      // stores value
        Node next;     // reference to next node

        Node(int data) {
            this.data = data;
            this.next = null; // initially no next node
        }
    }

    Node head; // first node
    Node tail; // last node

    // 🔹 Add at beginning (O(1))
    void addFirst(int data) {
        Node newNode = new Node(data); // create node

        newNode.next = head; // point to old head
        head = newNode;      // update head

        // if list was empty, tail also becomes new node
        if (tail == null) {
            tail = newNode;
        }
    }

    // 🔹 Add at end (O(1))
    void addLast(int data) {
        Node newNode = new Node(data); // create node

        // empty list case
        if (head == null) {
            head = tail = newNode;
            return;// leave
        }

        tail.next = newNode; // link last node
        tail = newNode;      // move tail forward to new node
    }

    // 🔹 Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; // move forward
        }

        System.out.println("null");
    }

    // 🔹 Main method (testing)
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // adding elements
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(30);

        // display result
        list.display(); // 5 -> 10 -> 20 -> 30 -> null
    }
}