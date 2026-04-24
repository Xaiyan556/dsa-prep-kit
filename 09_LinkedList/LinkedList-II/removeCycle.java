class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveCycle {

    public static void removeCycle(Node head) {

        if (head == null) return;

        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        // 🔁 Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        // ❌ No cycle
        if (!hasCycle) return;

        // 🎯 Step 2: Find start of cycle
        slow = head;//reset to head
        while (slow != fast) {
            slow = slow.next;//+1
            fast = fast.next;//+1
        }

        // ✂️ Step 3: Find last node of cycle
        while (fast.next != slow) {
            fast = fast.next;
        }

        // Break the loop
        fast.next = null;
    }

    // 🖨️ Print list safely (no infinite loop)
    public static void printList(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null && count < 20) { // safety limit
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // 🔁 Create cycle: 5 → 3
        head.next.next.next.next.next = head.next.next;

        removeCycle(head);

        printList(head);
    }
}