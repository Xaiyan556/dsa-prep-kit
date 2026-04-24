class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // points to first node
    Node tail; // points to last node

    // Insert at end (O(1) using tail)
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) { // empty list
            head = tail = newNode;
            return;
        }

        tail.next = newNode; // link last node
        tail = newNode;      // move tail forward
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}