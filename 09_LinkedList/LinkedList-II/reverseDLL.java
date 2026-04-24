// 🔥 Reverse a Doubly Linked List (Swap next & prev method)

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseDLL {

    // 🔁 Reverse function
    public static Node reverse(Node head) {

        Node curr = head;
        Node temp = null;

        // Traverse the list
        while (curr != null) {

            // 🔁 Swap next and prev
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // Move to next node (which is prev now)
            curr = curr.prev;
        }

        // 🔹 Fix new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    // 🖨️ Print forward
    public static void printForward(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ⇄ ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 🖨️ Print backward (to verify prev links)
    public static void printBackward(Node head) {
        Node curr = head;

        // go to last node
        while (curr.next != null) {
            curr = curr.next;
        }

        // traverse backward
        while (curr != null) {
            System.out.print(curr.data + " ⇄ ");
            curr = curr.prev;
        }
        System.out.println("null");
    }

    // 🚀 Main function
    public static void main(String[] args) {

        // Create DLL: 1 ⇄ 2 ⇄ 3 ⇄ 4
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Forward links
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Backward links
        second.prev = head;
        third.prev = second;
        fourth.prev = third;

        System.out.print("Original: ");
        printForward(head);

        // 🔁 Reverse
        head = reverse(head);

        System.out.print("Reversed: ");
        printForward(head);

        System.out.print("Backward Check: ");
        printBackward(head);
    }
}