// 🔥 Doubly Linked List Operations

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLL {

    static Node head = null;
    static Node tail = null;

    // 🔹 Add at beginning
    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) { // empty list
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 🔹 Add at end
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (tail == null) { // empty list
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 🔹 Remove from beginning
    public static void removeFirst() {
        if (head == null) return; // empty

        if (head == tail) { // single node
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null; // break link
    }

    // 🔹 Remove from end
    public static void removeLast() {
        if (tail == null) return;

        if (head == tail) { // single node
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null; // break link
    }

    // 🖨️ Print forward
    public static void printForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ⇄ ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 🖨️ Print backward
    public static void printBackward() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ⇄ ");
            curr = curr.prev;
        }
        System.out.println("null");
    }

    // 🚀 Main
    public static void main(String[] args) {
        addFirst(2);
        addFirst(1);
        addLast(3);
        addLast(4);

        printForward();   // 1 ⇄ 2 ⇄ 3 ⇄ 4 ⇄ null
        printBackward();  // 4 ⇄ 3 ⇄ 2 ⇄ 1 ⇄ null

        removeFirst();
        removeLast();

        printForward();   // 2 ⇄ 3 ⇄ null
    }
}