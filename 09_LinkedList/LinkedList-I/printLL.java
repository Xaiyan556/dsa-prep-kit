public class LinkedList {

    // 🔹 Node class (basic unit)
    static class Node {
        int data;      // stores value
        Node next;     // reference to next node

        Node(int data) {
            this.data = data;
            this.next = null; // initially points to null
        }
    }

    Node head; // first node
    Node tail; // last node

    // 🔹 Add at beginning
    void addFirst(int data) {
        Node newNode = new Node(data); // create node

        newNode.next = head; // link to old head
        head = newNode;      // move head

        // if list was empty
        if (tail == null) {
            tail = newNode;
        }
    }

    // 🔹 Add at end
    void addLast(int data) {
        Node newNode = new Node(data); // create node

        // empty list case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode; // link last node
        tail = newNode;      // move tail
    }

    // 🔹 Print Linked List (Traversal)
    void printList() {
        Node temp = head; // start from head

        while (temp != null) { // loop till end
            System.out.print(temp.data + " -> ");
            temp = temp.next;  // move forward
        }

        System.out.println("null");
    }

    // 🔹 Main method (testing everything)
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // adding elements
        list.addFirst(10);  // 10
        list.addFirst(5);   // 5 -> 10
        list.addLast(20);   // 5 -> 10 -> 20
        list.addLast(30);   // 5 -> 10 -> 20 -> 30

        // print list
        list.printList();
    }
}