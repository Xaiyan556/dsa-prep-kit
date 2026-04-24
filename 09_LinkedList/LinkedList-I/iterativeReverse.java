class Node {
    int data;
    Node next;

    // Constructor to create a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // 🔁 Function to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;   // will become new head
        Node curr = head;   // start from head

        while (curr != null) {

            Node next = curr.next; // 🧠 store next node

            curr.next = prev;      // 🔄 reverse pointer

            prev = curr;           // move prev forward
            curr = next;           // move curr forward
        }

        return prev; // new head after reversal
			        // at last
    }

    // 🖨️ Function to print linked list
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 🚀 Main function (driver code)
    public static void main(String[] args) {

        // Creating linked list: 10 → 20 → 30 → 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}