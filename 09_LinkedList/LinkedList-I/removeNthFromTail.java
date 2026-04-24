class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveNthNode {

    // 🧠 Function to remove nth node from end
    public static Node removeNth(Node head, int n) {

        // Step 1: calculate size
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: if head needs to be removed
        if (n == size) {
            return head.next;//head=head.next
            //remoove first
        }

        // Step 3: ==find previous node of target==
        int steps = size - n;
        Node prev = head;

        for (int i = 1; i < steps; i++) {
            prev = prev.next;
        }

        // Step 4: delete node
        prev.next = prev.next.next;

        return head;
    }

    // 🖨️ Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 🚀 Driver code
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original:");
        printList(head);

        head = removeNth(head, 3);

        System.out.println("After Removal:");
        printList(head);
    }
}