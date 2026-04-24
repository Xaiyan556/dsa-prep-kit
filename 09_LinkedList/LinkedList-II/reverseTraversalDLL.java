// 🔥 Doubly Linked List Reverse Traversal

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLLReverseTraversal {

    public static void main(String[] args) {

        // 🔹 Create DLL: 1 ⇄ 2 ⇄ 3 ⇄ 4
        Node head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Forward links
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Backward links (IMPORTANT)
        second.prev = head;
        third.prev = second;
        fourth.prev = third;

        // 🔁 Call reverse traversal
        printReverse(head);
    }

    // 🔁 Reverse Traversal Function
    public static void printReverse(Node head) {

        if (head == null) return;

        Node curr = head;

        // 🔹 Step 1: Move to last node (tail)
        while (curr.next != null) {
            curr = curr.next;
        }

        // Now curr is at LAST node

        // 🔹 Step 2: Traverse backwards
        while (curr != null) {
            System.out.print(curr.data + " ← ");
            curr = curr.prev; // move backward
        }

        System.out.println("null");
    }
}